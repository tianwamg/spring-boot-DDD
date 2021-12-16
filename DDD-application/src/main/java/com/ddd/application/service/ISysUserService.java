package com.ddd.application.service;

import com.ddd.api.dto.SysUserDto;

public interface ISysUserService {

    public SysUserDto getDetail(Long userId);
}
