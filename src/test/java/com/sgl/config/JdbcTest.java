package com.sgl.config;

import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @author: john
 * @version: 1.0 2014-06-10 下午11:28
 */
public class JdbcTest {

    /**
     * 测试数据库连接
     * @throws Exception
     */
    @Test
    public void testConnect() throws Exception {
        Properties prop = new Properties();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("application.properties");

        prop.load(inputStream);
        inputStream.close();

        Class.forName(prop.getProperty("spring.datasource.driverClassName"));
        String url = prop.getProperty("spring.datasource.url");
        String username = prop.getProperty("spring.datasource.username");
        String password = prop.getProperty("spring.datasource.password");

        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println(conn);
        Assert.assertNotNull(conn);
        conn.close();

    }

}
