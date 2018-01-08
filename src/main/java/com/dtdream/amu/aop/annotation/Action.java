package com.dtdream.amu.aop.annotation;

import java.lang.annotation.*;

/**
 * commit
 * Author : amu
 * Date : 2017/11/28 0028.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
