package com.ddd.api.facade;

import com.ddd.api.dto.SysUserDto;
import com.ddd.api.request.CommonRequest;
import com.ddd.api.response.ResultResponse;

public interface SysUserRpcApi {


    public ResultResponse<SysUserDto> getDetail(CommonRequest request);
}
