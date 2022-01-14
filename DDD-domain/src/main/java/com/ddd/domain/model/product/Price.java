package com.ddd.domain.model.product;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.*;

import java.math.BigDecimal;
import java.util.Currency;
@Getter
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Price {

    private Currency currency;

    @TableField("price")
    private BigDecimal value;

    public static Price of(String currencyCode,BigDecimal value){
        Currency currency = null;
        try{
            currency = Currency.getInstance(currencyCode);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new Price(currency,value);
    }
}
