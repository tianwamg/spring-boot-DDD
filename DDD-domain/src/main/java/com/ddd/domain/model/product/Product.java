package com.ddd.domain.model.product;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ddd.domain.command.CreateProductCommand;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@TableName("product")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField(value = "product_no")
    private String productNo;

    private String name;

    @TableField(exist = true,value = "price",numericScale = "2")
    private BigDecimal price;

    private Integer categoryId;

    @TableField(exist = true,value = "code")
    private ProductStatusEnum productStatus;

    private String remark;

    //private Boolean allowAcrossCategory;

    @TableField(exist = false)
    private Set<ProductCourseItem> productCourseItems;

    /*private static Product of(Long id,String productNo,String name,BigDecimal price,Integer categoryId,
                              Integer productStatus,String remark,Boolean allowAcrossCategory,Set<ProductCourseItem> productCourseItems){


        ProductNumber newProuctNo = ProductNumber.of(categoryId);
        ProductStatusEnum defaultProductStatus = ProductStatusEnum.DRAFTED;
        return new Product(null,newProuctNo,name,price,categoryId,productStatus,remark,allowAcrossCategory,productCourseItems);
    }*/

    public static Product of(CreateProductCommand command){
        Integer categoryId = command.getCategoryId();
        Price price = Price.of(command.getCurrencyCode(),command.getPrice());

        ProductNumber newProductNo = ProductNumber.of(categoryId);
        ProductStatusEnum defaultProductStatus = ProductStatusEnum.DRAFTED;
        return new Product(null,newProductNo.getValue(), command.getName(), price.getValue(),categoryId,defaultProductStatus,command.getRemark(), command.getProductCourseItems());
    }

    public void listing(){
    }

    public void unlist(){
        if(!this.productStatus.equals(ProductStatusEnum.LISTED)){
            //throw
        }
        this.productStatus = ProductStatusEnum.UNLISTED;

    }

    public void mutate(){
        //update
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productNo,product.productNo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(productNo);
    }
}
