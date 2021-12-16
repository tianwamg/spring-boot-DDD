package com.ddd.application;

import com.ddd.application.service.ISysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DddApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    ISysUserService sysUserService;

    @org.junit.Test
    public void aa(){
        sysUserService.getDetail(1l);
    }

}
