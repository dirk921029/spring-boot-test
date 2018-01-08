package com.dtdream.amu.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * commit
 * Author : amu
 * Date : 2018/1/8 0008.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfigure.class);

        DemoService demoService = context.getBean(DemoService.class);

        demoService.outputResult();

        context.close();
    }
}
