package com.davnn.template.util.exception.illegal;

import com.davnn.template.util.exception.BaseException;

public abstract class IllegalStateException extends BaseException {
    protected String fieldValue;

    public IllegalStateException(String code, String fieldValue) {
        super(fieldValue);
        this.fieldValue = fieldValue;
        this.code = code;
    }

    private String code;

    @Override
    public String getCode() {
        return code;
    }
}