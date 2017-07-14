package com.df.water.aspect;


import com.df.water.constant.UnifyReturnData;
import com.df.water.exception.WaterPermissionException;
import com.df.water.exception.WaterRuntimeException;
import com.llq.commons.utils.verify.tools.Assert;
import com.llq.login.client.utils.LoginCookieUtils;
import com.llq.login.common.domain.LlqWebUser;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * 用户访问权限切面
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
@Aspect
@Component
public class AccessPermissionAspect {

    private static final Logger logger = LoggerFactory.getLogger(AccessPermissionAspect.class);

    @Pointcut(value = "@annotation(com.df.water.annotation.EnableAccessPermission)")
    public void AccessPermissionAspect() {}

    /**
     * 预检查访问权限, Before Advice
     */
    @Before(value = "AccessPermissionAspect()")
    public void preCheckAccessPermission() {

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Cookie[] cookies = request.getCookies();

        Assert.isArrayNotNull("cookie不能为空", cookies);

        LlqWebUser jolanWaterUser = null;
        if (null != cookies) {
            try {
                jolanWaterUser = LoginCookieUtils.getLlqWebUser(cookies);
            } catch (Exception e) {
                logger.error("调用远程登录中心获取用户信息失败, e = {}", e.getMessage());
                throw new WaterRuntimeException(UnifyReturnData.SERVER_BUSYNESS.getMsg(), UnifyReturnData.SERVER_BUSYNESS.getCode());
            }
        }

        if (null == jolanWaterUser) {
            throw new WaterPermissionException(UnifyReturnData.ACCESS_NO_PERMISSION.getMsg(), UnifyReturnData.ACCESS_NO_PERMISSION.getCode());
        }
    }
}
