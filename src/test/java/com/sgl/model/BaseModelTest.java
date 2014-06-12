package com.sgl.model;

import org.junit.Test;

import java.util.Date;

/**
 * @author: john
 * @version: 1.0 2014-06-10 下午11:54
 */
public class BaseModelTest {

    @Test
    public void testToString() throws Exception {
        BasisAppCode model = new BasisAppCode();
        model.setAppName("App1");
        model.setAuthor("lc");
        model.setCode("LC001");
        model.setCreateDate(new Date());
        System.out.println(model);
    }

}
