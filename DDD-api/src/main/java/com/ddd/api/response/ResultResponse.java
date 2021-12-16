package com.ddd.api.response;

import java.io.Serializable;

public class ResultResponse<T> implements Serializable {

    private String code;

    private String msg;

    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        data = data;
    }

    public ResultResponse(String code,String msg,T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> ResultResponse<T> success(T data){
        return new ResultResponse<>("200","success",data);
    }

    public static <T> ResultResponse<T> success(String msg,T data){
        return new ResultResponse<>("200",msg,data);
    }

    public static <T> ResultResponse<T> success(String code,String msg,T data){
        return new ResultResponse<>(code,msg,data);
    }

    public static <T> ResultResponse<T> error(String msg,T data){
        return new ResultResponse<>("500",msg,data);
    }

    public static <T> ResultResponse<T> error(String code,String msg){
        return new ResultResponse<>(code,msg,null);
    }

    public static <T> ResultResponse<T> error(String code,String msg,T data){
        return new ResultResponse<>(code,msg,data);
    }
}
