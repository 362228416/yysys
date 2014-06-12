package com.sgl.common;

import com.sgl.app.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: john
 * @version: 1.0 2014-06-10 上午12:03
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class SpringTestCase {

    @Test
    public void testMarker() throws Exception {

    }

}
