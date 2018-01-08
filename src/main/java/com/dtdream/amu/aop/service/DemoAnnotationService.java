package com.dtdream.amu.aop.service;

import org.springframework.stereotype.Service;

import com.dtdream.amu.aop.annotation.Action;

/**
 * commit
 * Author : amu
 * Date : 2017/11/28 0028.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add() {
        System.out.println("DemoAnnotationService");
    }
}
