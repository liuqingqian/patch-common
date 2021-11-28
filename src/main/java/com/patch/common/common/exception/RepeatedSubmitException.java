package com.patch.common.common.exception;

public class RepeatedSubmitException extends RuntimeException {
    public RepeatedSubmitException() {
    }

    public RepeatedSubmitException(String msg) {
        super(msg);
    }
}
