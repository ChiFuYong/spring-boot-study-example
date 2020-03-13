package com.chifuyong;

import com.chifuyong.service.TestService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: chify
 * @Date: 17/12/2019 16:27
 * @Description:
 */
// @RunWith 作用： Junit 与 Spring 整合
@RunWith(SpringJUnit4ClassRunner.class)
// @SpringBootTest 作用：1.当前类为测试类    2.加载 SpringBoot 启动类
@SpringBootTest(classes = {ExceptionApplication.class})
public class TestJunit {

    @Autowired
    public TestService testService;

    @Before
    public void before(){
        System.out.println("before......");
    }

    @After
    public void after(){
        System.out.println("after......");
    }

    @Test
    public void test(){
        testService.test();
    }
}
