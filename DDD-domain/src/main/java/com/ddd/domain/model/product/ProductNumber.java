package com.ddd.domain.model.product;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 商品编码
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class ProductNumber {

    private String value;

    public static ProductNumber of(Integer categoryId){
        return new ProductNumber(generateProductNo(categoryId));

    }

    public static ProductNumber of(String value){
        return new ProductNumber(value);

    }

    private static String generateProductNo(Integer categoryId){
        String prefix = "PRODUCT";
        String typeStr = String.format("%04d",categoryId);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String currentTime = sdf.format(new Date());
        int randomNum = (int) (Math.random() * 999 +1);
        String randomNumStr = String.format("%04d",randomNum);
        return prefix + typeStr + currentTime + randomNumStr;
    }
}
