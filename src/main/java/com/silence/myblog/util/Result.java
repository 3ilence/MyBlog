package com.silence.myblog.util;


import java.io.Serializable;

/**
 * @ClassName : Result
 * @Author : Silence
 * @Date: 2021/6/14 19:43
 * @Description :
 */
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**Http状态码*/
    private int resultCode;
    /**结果信息*/
    private String message;
    /**数据*/
    private T data;

    public Result() {
    }

    public Result(int resultCode, String message) {
        this.resultCode = resultCode;
        this.message = message;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultCode=" + resultCode +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
