package com.ddd.domain.repository;

import com.ddd.domain.entity.SysUser;

public interface SysUserRepository {

    public Integer save(SysUser sysUser);

    public SysUser getDetail(Long userId);
}
