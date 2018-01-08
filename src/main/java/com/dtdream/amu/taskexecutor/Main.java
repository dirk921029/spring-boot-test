package com.dtdream.amu.taskexecutor;

import com.dtdream.amu.taskexecutor.config.TaskExecutorConfig;
import com.dtdream.amu.taskexecutor.service.AsyncTaskService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * commit
 * Author : amu
 * Date : 2018/1/8 0008.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);

        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

        for(int i = 0; i < 10; i ++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }

        context.close();
    }
}
