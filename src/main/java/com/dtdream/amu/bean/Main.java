package com.dtdream.amu.bean;

import com.dtdream.amu.bean.config.ScopeConfig;
import com.dtdream.amu.bean.service.DemoPrototypeService;
import com.dtdream.amu.bean.service.DemoSingletonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * commit
 * Author : amu
 * Date : 2018/1/5 0005.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

        System.out.println("s1=s2?" + s1.equals(s2));
        System.out.println("p1=p2?" + p1.equals(p2));

        context.close();
    }
}
