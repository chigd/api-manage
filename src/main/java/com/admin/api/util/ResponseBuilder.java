package com.admin.api.util;

/**
 * 
 * @Title: 基础响应类  
 * @author: chigd  
 * @date:2017年11月3日 上午11:28:19
 */
public class ResponseBuilder {

    // 响应业务状态
    private Integer code;

    // 响应中的数据
    private Object data;

    public static ResponseBuilder success(Object data){
        return new ResponseBuilder(200,data);
    }
    public static ResponseBuilder success(){
        return new ResponseBuilder(200);
    }

    public ResponseBuilder(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

    public ResponseBuilder(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer errCode) {
        this.code = errCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
