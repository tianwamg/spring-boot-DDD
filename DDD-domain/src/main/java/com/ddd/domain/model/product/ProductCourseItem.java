package com.ddd.domain.model.product;

import lombok.*;

import java.math.BigDecimal;

@Getter
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductCourseItem {

    private String courseItemNo;

    private BigDecimal newPrice;

    public static ProductCourseItem of(String courseItemNo,BigDecimal retakePrice){
        return new ProductCourseItem(courseItemNo,retakePrice);
    }


}
