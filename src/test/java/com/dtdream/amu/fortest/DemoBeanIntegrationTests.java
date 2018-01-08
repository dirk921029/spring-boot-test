package com.dtdream.amu.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * commit
 * Author : amu
 * Date : 2018/1/8 0008.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("dev")
public class DemoBeanIntegrationTests {
    @Autowired TestBean testBean;

    @Test
    public void prodBeanShouldInject() {
        String expected = "from dev";
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);
    }
}
