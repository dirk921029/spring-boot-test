package com.dtdream.amu.el;

import com.dtdream.amu.el.config.ELConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * commit
 * Author : amu
 * Date : 2018/1/5 0005.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);

        ELConfig resourceService = context.getBean(ELConfig.class);

        resourceService.outputResource();

        context.close();
    }
}
