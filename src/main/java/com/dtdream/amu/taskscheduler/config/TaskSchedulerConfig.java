package com.dtdream.amu.taskscheduler.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * commit
 * Author : amu
 * Date : 2018/1/8 0008.
 */
@Configuration
@ComponentScan("com.dtdream.amu.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
