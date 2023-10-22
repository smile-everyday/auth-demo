package cn.dark.auth.core.exception;

/**
 * @author dark
 * @date 2023-10-22
 */
public class AuthBaseException extends RuntimeException {

    private int code = ExceptionCode.UNDEFINED;

    public AuthBaseException(String message) {
        super(message);
    }

    public AuthBaseException(int code, String message) {
        super(message);

        this.code = code;
    }

}
