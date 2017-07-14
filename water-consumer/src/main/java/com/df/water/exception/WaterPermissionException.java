package com.df.water.exception;

/**
 * 访问权限, 运行时异常
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
public class WaterPermissionException extends WaterRuntimeException {

    private static final long serialVersionUID = 1L;

    private String message;

    private Integer code;

    private Throwable cause;

    public WaterPermissionException() {}

    public WaterPermissionException(String message) {
        this.message = message;
    }

    public WaterPermissionException(String message, Integer code) {
        this(message);
        this.code = code;
    }

    public WaterPermissionException(String message, Throwable cause) {
        this(message);
        this.cause = cause;
    }

    public WaterPermissionException(String message, Integer code, Throwable cause) {
        this(message, code);
        this.cause = cause;
    }


}
