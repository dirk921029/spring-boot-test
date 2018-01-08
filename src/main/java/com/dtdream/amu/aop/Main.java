package com.dtdream.amu.aop;

import com.dtdream.amu.aop.config.AopConfig;
import com.dtdream.amu.aop.service.DemoAnnotationService;
import com.dtdream.amu.aop.service.DemoMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * commit
 * Author : amu
 * Date : 2017/11/28 0028.
 */
public class Main {
    @Autowired

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();

        demoMethodService.add();

        context.close();
    }
}
