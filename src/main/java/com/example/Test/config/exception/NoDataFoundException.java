package com.example.Test.config.exception;

public class NoDataFoundException extends RuntimeException {

    public NoDataFoundException(String key) {
        super(String.format("No Data found from key: %s", key));
    }

}
