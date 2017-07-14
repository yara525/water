package com.df.water.constant;

/**
 * 统一返回错误码枚举常亮
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
public enum UnifyReturnData {

    ACCESS_SUCCESS("操作成功", 200),
    ACCESS_FAILURE("操作失败", 201),
    ACCESS_NO_PERMISSION("无访问权限", 401),
    SERVER_BUSYNESS("服务器繁忙,请稍后再试", 402);

    /** 响应消息 */
    private String msg;

    /** 响应代码 */
    private Integer code;

    // 不能带public修饰符
    UnifyReturnData(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

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
}
