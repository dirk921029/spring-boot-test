package com.dtdream.amu.event;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * commit
 * Author : amu
 * Date : 2018/1/8 0008.
 */
@Data
public class DemoEvent extends ApplicationEvent{

    private static final long serialVersionUID = 1L;

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }
}
