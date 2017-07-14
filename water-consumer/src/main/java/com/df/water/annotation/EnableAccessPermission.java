package com.df.water.annotation;

import java.lang.annotation.*;

/**
 * Indicates that the access permission of matched methods will be
 * controlled in some way.
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
@Documented
@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface EnableAccessPermission {
}
