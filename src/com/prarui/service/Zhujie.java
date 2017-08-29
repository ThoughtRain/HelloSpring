package com.prarui.service;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/8/10.
 */
@Target(ElementType.FIELD)
/**
 * 只有在运行时才能用反射获取；
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Zhujie {
    String value() default "";
}
