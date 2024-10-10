package net.javaguides.springboot.customexception;

import org.springframework.stereotype.Component;

@Component
public class ControllerException extends RuntimeException {
    private String errorCode;
    private String errorMessage;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ControllerException(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public ControllerException(String message, String errorCode, String errorMessage) {
        super(message);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public ControllerException(String message, Throwable cause, String errorCode, String errorMessage) {
        super(message, cause);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public ControllerException(Throwable cause, String errorCode, String errorMessage) {
        super(cause);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public ControllerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String errorCode, String errorMessage) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public ControllerException() {
    }
}


