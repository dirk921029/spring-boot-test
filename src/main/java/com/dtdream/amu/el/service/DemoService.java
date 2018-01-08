package com.dtdream.amu.el.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * commit
 * Author : amu
 * Date : 2018/1/5 0005.
 */
@Service
@Data
public class DemoService {

    @Value("其他类的属性")
    private String another;
}
