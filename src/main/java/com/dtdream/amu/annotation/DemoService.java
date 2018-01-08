package com.dtdream.amu.annotation;

import org.springframework.stereotype.Service;

/**
 * commit
 * Author : amu
 * Date : 2018/1/8 0008.
 */
@Service
public class DemoService {

    public void outputResult() {
        System.out.println("从组合注解配置照样获得的bean");
    }
}
