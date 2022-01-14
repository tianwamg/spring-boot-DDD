package com.ddd.interfaces;

import com.ddd.api.dto.SysUserDto;
import com.ddd.application.service.ISysUserService;
import com.ddd.application.service.ProductService;
import com.ddd.domain.command.CreateProductCommand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Calendar;

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

    @Autowired
    ProductService productService;

    @Test
    public void product(){
        CreateProductCommand command = CreateProductCommand.of("no-1",1,"CNY",new BigDecimal("10.02"),"test",
                true,null);
        productService.save(command);
    }

    @Test
    public void list(){
        //productService.list();
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
    }

}
