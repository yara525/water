package com.df.water.exception;


/**
 * 节水运行时异常
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
public class WaterRuntimeException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String message;

    private Integer code;

    private Throwable cause;

    public WaterRuntimeException() {}

    public WaterRuntimeException(String message) {
        this.message = message;
    }

    public WaterRuntimeException(String message, Integer code) {
        this(message);
        this.message = message;
    }

    public WaterRuntimeException(String message, Throwable cause) {
        this(message);
        this.message = message;
    }

    public WaterRuntimeException(String message, Integer code, Throwable cause) {
        this(message, code);
        this.cause = cause;
    }
}
