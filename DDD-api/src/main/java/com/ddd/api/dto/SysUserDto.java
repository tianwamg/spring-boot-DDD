package com.ddd.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysUserDto implements Serializable {

    private Integer userId;

    private String userName;

    private String phone;

    private Integer gender;

    private Integer status;

    private Date ctime;

    private Date mtime;
}
