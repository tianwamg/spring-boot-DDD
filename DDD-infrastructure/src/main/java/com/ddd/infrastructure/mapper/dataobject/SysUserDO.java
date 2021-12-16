package com.ddd.infrastructure.mapper.dataobject;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("sys_user")
public class SysUserDO {

    private Integer id;

    private String userName;

    private String phone;

    private Integer gender;

    @TableLogic(value = "1",delval = "-1")
    @TableField(fill = FieldFill.INSERT)
    private Integer status;

    @TableField(fill = FieldFill.INSERT)
    private Date ctime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date mtime;
}
