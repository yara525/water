package com.df.water.web.common;

import com.llq.login.client.utils.LoginCookieUtils;
import com.llq.login.common.domain.LlqWebUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用户权限操作控制
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
public class BaseController {

    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    /**
     * 获取正蓝节能用户基本信息
     *
     * @return user info
     */
    public LlqWebUser getJolanWaterUser() {

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Cookie[] cookies = request.getCookies();

        LlqWebUser jolanWaterUser = null;
        if (null != cookies) {
            try {
                jolanWaterUser = LoginCookieUtils.getLlqWebUser(cookies);
            } catch (Exception e) {
                logger.error("调用远程登录中心获取用户信息失败, e = {}", e.getMessage());
            }
        }

        return jolanWaterUser;
    }

    /**
     * 根据请求携带的cookie, 获取正蓝节能用户id, 判断用户是否在app端登录
     *
     * @return id
     */
    public Long getLoginUserId() {

        Long loginUserId = null;

        LlqWebUser jolanWaterUser = this.getJolanWaterUser();
        if (null != jolanWaterUser) {
            loginUserId = jolanWaterUser.getUserId();
        }

        return loginUserId;
    }

//    /**
//     * 获取csrf_token,设置是否登录的标记
//     *
//     * @param request
//     * @param baseResult
//     * @return
//     */
//    public BaseResult returnResult(HttpServletRequest request, BaseResult baseResult) {
////        Object csrfToken = request.getAttribute(SecurityConstants.CSRF_PARAMETER_NAME);
////
////        if (csrfToken != null) {
////            baseResult.set_csrf(((CsrfToken) csrfToken).getToken());
////        }
////
////        boolean isLogin = false;
////        Object isLoginObj = request.getAttribute(SecurityConstants.X_IS_LOGIN);
////        if (isLoginObj != null && isLoginObj instanceof Boolean) {
////            isLogin = (Boolean) isLoginObj;
////        }
////        baseResult.setLogin(isLogin);
//
//        if (baseResult.getData() != null && (baseResult.getData().getClass().isArray()
//                || baseResult.getData() instanceof List)) {
//            // 统一Object封装
//            baseResult.setData(new Items(baseResult.getData()));
//        }
//
//        return baseResult;
//    }
}
