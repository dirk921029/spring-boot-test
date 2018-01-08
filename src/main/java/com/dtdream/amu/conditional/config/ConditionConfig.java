package com.dtdream.amu.conditional.config;

import com.dtdream.amu.conditional.ListService;
import com.dtdream.amu.conditional.WindowCondition;
import com.dtdream.amu.conditional.WindowsListService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * commit
 * Author : amu
 * Date : 2018/1/8 0008.
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowCondition.class)
    public ListService windowsListService() {
        return new WindowsListService();
    }
}
