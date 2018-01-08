package com.dtdream.amu.profile;

import com.dtdream.amu.profile.config.ProfileConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * commit
 * Author : amu
 * Date : 2018/1/8 0008.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();
    }
}
