package com.mars.share.message;

import com.mars.share.enums.CodeEnum;
import java.io.Serializable;

/**
 * 返回结果
 * @author stonew1987
 * @create 2018-01-19 17:25
 **/
//保证序列化json的时候,如果是null的对象,key也会消失
public class BaseResult<T> implements Serializable {

    /**
     * 请求编码
     */
    private int code = 0;
    /**
     * 信息
     */
    private String msg = "";
    /**
     * 返回值
     */
    private T value;

    public BaseResult(int code) {
        this.code = code;
    }

    public BaseResult(int code, T value) {
        this.code = code;
        this.value = value;
    }

    public BaseResult(int code, String msg, T value) {
        this.msg = msg;
        this.code = code;
        this.value = value;
    }

    public BaseResult(String msg, T value) {
        this.msg = msg;
        this.value = value;
    }

    public BaseResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    //使之不在json序列化结果当中
    public boolean isSuccess(){
        return this.code == CodeEnum.SUCCESS.getCode();
    }


    public static <T> BaseResult<T> createBySuccess(){
        return new BaseResult<T>(CodeEnum.SUCCESS.getCode());
    }

    public static <T> BaseResult<T> createBySuccessMessage(String msg){
        return new BaseResult<T>(CodeEnum.SUCCESS.getCode(), msg);
    }


    public static <T> BaseResult<T> createBySuccess(T data){
        return new BaseResult<T>(CodeEnum.SUCCESS.getCode(), data);
    }


    public static <T> BaseResult<T> createBySuccess(String msg, T data){
        return new BaseResult<T>(CodeEnum.SUCCESS.getCode(), msg , data);
    }


    public static <T> BaseResult<T> createByError(CodeEnum codeEnum){
        return new BaseResult<T>(codeEnum.getCode(), codeEnum.getErrorMsg());
    }

    public static <T> BaseResult<T> createByErrorCodeMessage(int code, String msg){
        return new BaseResult<T>(code, msg);
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    public T getValue() {
        return value;
    }
}
