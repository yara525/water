package com.df.water.utils;

/**
 * Result封装返回信息, 分页与不分页区分接口
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
public class Result {

    /* 返回消息 */
    private String msg;

    /* 返回状态码 */
    private Integer code;

    /* 返回业务数据 */
    private Object data;

    /* 返回分页信息 */
    private Object page;

    public Result() {}

    /**
     * 非分页无业务内容封装
     *
     * @param msg
     * @param code
     */
    public Result(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }


    /**
     * 非分页数据封装
     *
     * @param msg
     * @param code
     * @param data
     */
    public Result(String msg, Integer code, Object data) {
        this(msg, code);
        this.data = data;
    }

    /**
     * 分页数据封装
     *
     * @param msg
     * @param code
     * @param data
     * @param page
     */
    public Result(String msg, Integer code, Object data, Object page) {
        this(msg, code, data);
        this.page = page;
    }

    /**
     * 返回封装的非分页无业务内容数据
     *
     * @param msg
     * @param code
     * @return response data
     */
    public static Result create(String msg, Integer code) {
        return new Result(msg, code);
    }

    /**
     * 返回封装的非分页数据
     *
     * @param msg
     * @param code
     * @param data
     * @return response data
     */
    public static Result create(String msg, Integer code, Object data) {
        return new Result(msg, code, data);
    }

    /**
     * 返回封装的分页数据
     *
     * @param msg
     * @param code
     * @param data
     * @param page
     * @return response data
     */
    public static Result create(String msg, Integer code, Object data, Object page) {
        return new Result(msg, code, data, page);
    }

    // 必须使用setter和getter方法,　fastjson通过其将对象与json格式之间转换

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getPage() {
        return page;
    }

    public void setPage(Object page) {
        this.page = page;
    }
}
