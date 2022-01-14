package com.ddd.application.command;

import com.ddd.domain.model.product.ProductCourseItem;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CreateProductCommand {

    private String name;
    private Integer categoryId;
    private String  currencyCode;
    private BigDecimal price;
    private String remark;
    private Boolean alowAcrossCategory;
    private Set<ProductCourseItem> productCourseItems;

    public static CreateProductCommand of(String name,Integer categoryId,String currencyCode,BigDecimal price,String remark,
                                          Boolean alowAcrossCategory,Set<ProductCourseItem> productCourseItems){
        Set<String> dup = getDuplicateItemNo(productCourseItems);
        if(!CollectionUtils.isEmpty(dup)){
            //throw new Exception("");
        }
        return new CreateProductCommand(name,categoryId,currencyCode,price,remark,alowAcrossCategory,productCourseItems);
    }

    public static Set<String> getDuplicateItemNo(Set<ProductCourseItem> productCourseItems){
        if(CollectionUtils.isEmpty(productCourseItems)){
            return null;
        }
        Map<String,Long> duplicateedNoMap = productCourseItems.stream().collect(collectingAndThen(groupingBy(ProductCourseItem::getCourseItemNo,counting()),
                m -> {
                    m.values().removeIf(v -> v<=1);
                    return m;
                }));
        return duplicateedNoMap.keySet();
    }
}
