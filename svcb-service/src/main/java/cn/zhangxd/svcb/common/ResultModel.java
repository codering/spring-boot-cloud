package cn.zhangxd.svcb.common;

import java.io.Serializable;

public class ResultModel implements Serializable {

    private static final Integer SUCCESS_CODE = 1;
    private static final String SUCCESS_MSG = "OK";

    private static final Integer ERROR_CODE = -1;
    private static final String ERROR_MESSAGE = "ERROR";

    /*错误码*/
    private Integer code;

    /*提示信息 */
    private String msg;

    /*具体内容*/
    private  Object data;

    private ResultModel() {}

    public ResultModel(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResultModel build(Integer code, String msg, Object data) {
        return new ResultModel(code, msg, data);
    }

    public static ResultModel success() {
        return build(SUCCESS_CODE, SUCCESS_MSG, null);
    }

    public static ResultModel success(String msg) {
        return build(SUCCESS_CODE, msg, null);
    }

    public static ResultModel success(Object data) {
        return build(SUCCESS_CODE, SUCCESS_MSG, data);
    }

    public static ResultModel success(String msg, Object data) {
        return build(SUCCESS_CODE, msg, data);
    }

    public static ResultModel error() {
        return build(ERROR_CODE, ERROR_MESSAGE, null);
    }

    public static ResultModel error(String msg) {
        return build(ERROR_CODE, msg, null);
    }

    public static ResultModel error(Object data) {
        return build(ERROR_CODE, ERROR_MESSAGE, data);
    }

    public static ResultModel error(String msg, Object data) {
        return build(ERROR_CODE, msg, data);
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }
}
