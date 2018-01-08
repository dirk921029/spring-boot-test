package com.dtdream.amu.taskscheduler.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * commit
 * Author : amu
 * Date : 2018/1/8 0008.
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("5s " + DATE_FORMAT.format(new Date()));
    }

    @Scheduled(cron = "0 19 16 ? * *")
    public void fixTimeExecution() {
        System.out.println("time " + DATE_FORMAT.format(new Date()) + "execute");
    }
}
