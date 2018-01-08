package com.dtdream.amu.aop.service;

/**
 * commit
 * Author : amu
 * Date : 2017/11/28 0028.
 */
public class UseService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String useService(String name) {
        return functionService.sayHello(name);
    }
}
