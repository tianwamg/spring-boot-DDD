package com.ddd.domain.model.product;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CourseItem {

    private Long id;

    private String itemNo;

    private String name;

    private Integer categoryId;

    private BigDecimal price;

    private String remark;

    private Integer studyType;

    private Integer period;

    private Date deadline;

    public static CourseItem of(String itemNo,String name,Integer categoryId,BigDecimal price,String remark,Integer studyType,Integer period,Date deadline){
        return new CourseItem(null,itemNo,name,categoryId,price,remark,studyType,period,deadline);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseItem that = (CourseItem) o;
        return itemNo.equals(that.itemNo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(itemNo);
    }
}
