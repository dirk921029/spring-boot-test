package com.dtdream.amu.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * commit
 * Author : amu
 * Date : 2018/1/8 0008.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{

    @Override
    public void onApplicationEvent(DemoEvent event) {

        String msg = event.getMsg();

        System.out.println("DemoListener接收到了DemoPublisher发布的消息:" + msg);
    }
}
