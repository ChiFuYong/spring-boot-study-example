package com.chifuyong.service.impl;

import com.chifuyong.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @Auther: chify
 * @Date: 17/12/2019 16:30
 * @Description:
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public void test() {
        System.out.println("Junit测试成功");
    }
}
