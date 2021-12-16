package com.ddd.application.service;

import com.ddd.api.dto.SysUserDto;
import com.ddd.application.assemble.SysUserAssemble;
import com.ddd.domain.repository.SysUserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("sysUserService")
public class SysUserService implements ISysUserService {

    @Resource
    SysUserRepository sysUserRepository;

    public SysUserDto getDetail(Long userId){
        return SysUserAssemble.INSTANCE.ConverToDto(sysUserRepository.getDetail(userId));
    }
}
