package com.df.water.aspect;

import com.llq.commons.utils.time.TimeUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * web层日志切面, 统一处理request日志
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */

@Aspect
// @Order(5)    //　spring boot开启组件次序
@Component
public class WebLoggerAspect {

    private static final Logger logger = LoggerFactory.getLogger(WebLoggerAspect.class);

    ThreadLocal<Date> threadLocal = new ThreadLocal<>();

    @Pointcut(value = "execution(public * com.df.water.web.module.*.*(..)) && !execution(public * com.df.water.web.common.*.*(..))")
    public void webLoggerPointcut() {}


    @Before(value = "webLoggerPointcut()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println(TimeUtils.currentTime() + "test before advise");
    }


    @After(value = "webLoggerPointcut()")
    public void deAfter(JoinPoint joinPoint) {
        System.out.println(TimeUtils.currentTime() + "test after advise");
    }
}
