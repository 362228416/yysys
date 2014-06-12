package com.sgl.repository;

import com.sgl.common.SpringTestCase;
import com.sgl.model.BasisAppCode;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

public class BasisAppCodeRepositoryTest extends SpringTestCase {

    @Autowired
    BasisAppCodeRepository repository;

    @Test
    public void testCurd() throws Exception {
        // 增删改查测试
        BasisAppCode model = new BasisAppCode();
        model.setAppName("App1");
        model.setAuthor("lc");
        model.setCode("LC001");
        model.setCreateDate(new Date());
        repository.save(model);
        System.out.println(model);
        assertNotNull(model.getId());

        model.setAppName("App2");
        repository.save(model);

        BasisAppCode one = repository.findOne(model.getId());
        System.out.println(one);
        assertNotNull(one);
        assertEquals(model.getAppName(), one.getAppName());

        repository.delete(one);
        one = repository.findOne(model.getId());
        System.out.println(one);
        assertNull(one);
    }

}