package com.dtdream.amu.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * commit
 * Author : amu
 * Date : 2017/11/28 0028.
 */
@Configuration
@ComponentScan("com.dtdream.amu.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
