package com.ddd.infrastructure.repository.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ddd.domain.entity.SysUser;
import com.ddd.domain.repository.SysUserRepository;
import com.ddd.infrastructure.converter.SysUserDOConverter;
import com.ddd.infrastructure.mapper.SysUserMapper;
import com.ddd.infrastructure.mapper.dataobject.SysUserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserRepositoryImpl implements SysUserRepository {

    @Resource
    SysUserMapper sysUserMapper;


    @Override
    public Integer save(SysUser sysUser) {

        return sysUserMapper.insert(SysUserDOConverter.INSTANCE.convertToDO(sysUser));
    }

    public SysUser getDetail(Long userId){
        QueryWrapper<SysUserDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(SysUserDO::getId,userId);
        return SysUserDOConverter.INSTANCE.convertFromDO(sysUserMapper.selectOne(queryWrapper));
    }

}
