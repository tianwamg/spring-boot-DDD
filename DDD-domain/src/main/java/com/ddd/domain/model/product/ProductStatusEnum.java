package com.ddd.domain.model.product;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ProductStatusEnum {

    DRAFTED(1000111,"草稿"),
    AUDIT_PENDING(1000112,"待审核"),
    LISTED(1000113,"已上架"),
    UNLISTED(1000114,"已下架"),
    EXPIRED(1000115,"已过期");

    @Getter
    @EnumValue
    private Integer code;

    @Getter
    private String remark;

    public static ProductStatusEnum of(Integer code){
        ProductStatusEnum[] values = ProductStatusEnum.values();
        for(ProductStatusEnum val : values){
            if(val.getCode().equals(code)){
                return val;
            }
        }
        return null;
    }
}
