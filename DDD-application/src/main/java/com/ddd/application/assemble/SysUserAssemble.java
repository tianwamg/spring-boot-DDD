package com.ddd.application.assemble;

import com.ddd.api.dto.SysUserDto;
import com.ddd.domain.entity.SysUser;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class SysUserAssemble {

    public static final SysUserAssemble INSTANCE = Mappers.getMapper(SysUserAssemble.class);

    @Mapping(source = "id" ,target = "userId")
    public abstract SysUserDto ConverToDto(SysUser sysUser);
}
