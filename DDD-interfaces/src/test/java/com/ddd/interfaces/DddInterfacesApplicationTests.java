package com.ddd.interfaces;

import com.ddd.api.dto.SysUserDto;
import com.ddd.application.service.ISysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DddInterfacesApplicationTests {

    @Autowired
    ISysUserService sysUserService;

    @Test
    public void contextLoads() {
        SysUserDto sysUserDto = sysUserService.getDetail(2l);
        System.out.println(sysUserDto.getUserId());
    }

}
