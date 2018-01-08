package com.dtdream.amu.taskexecutor.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * commit
 * Author : amu
 * Date : 2018/1/8 0008.
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("async task:" + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("async task+1: " + (i + 1));
    }
}
