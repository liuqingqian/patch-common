package com.patch.common.common.exception;

public class RedisException extends RuntimeException{

    public RedisException(){}

    public RedisException(String msg) {
        super(msg);
    }

}
