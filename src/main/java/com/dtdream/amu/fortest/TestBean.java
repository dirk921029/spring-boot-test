package com.dtdream.amu.fortest;

import lombok.Data;

/**
 * commit
 * Author : amu
 * Date : 2018/1/8 0008.
 */
@Data
public class TestBean {

    private String content;

    public TestBean(String content) {
        super();
        this.content = content;
    }
}
