package com.ddd.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SysUser {

    private Integer id;

    private String userName;

    private String phone;

    private Integer gender;

    private Integer status;

    private Date ctime;

    private Date mtime;
}
