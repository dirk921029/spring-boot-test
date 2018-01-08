package com.dtdream.amu.aop.config;

import com.dtdream.amu.aop.service.FunctionService;
import com.dtdream.amu.aop.service.UseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * commit
 * Author : amu
 * Date : 2017/11/28 0028.
 */
@Configuration
public class JavaConfig {

    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UseService useService() {
        UseService useService = new UseService();
        useService.setFunctionService(functionService());
        return useService;
    }

    @Bean
    public UseService useService(FunctionService functionService) {
        UseService useService = new UseService();
        useService.setFunctionService(functionService);
        return useService;
    }
}
