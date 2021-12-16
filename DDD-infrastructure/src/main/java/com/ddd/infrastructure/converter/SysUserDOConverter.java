package com.ddd.infrastructure.converter;

import com.ddd.domain.entity.SysUser;
import com.ddd.infrastructure.mapper.dataobject.SysUserDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SysUserDOConverter {

    SysUserDOConverter INSTANCE = Mappers.getMapper(SysUserDOConverter.class);

    SysUserDO convertToDO(SysUser sysUser);

    SysUser convertFromDO(SysUserDO sysUserDO);
}
