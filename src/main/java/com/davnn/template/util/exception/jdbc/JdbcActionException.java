package com.davnn.template.util.exception.jdbc;

import com.davnn.template.util.exception.BaseException;

public abstract class JdbcActionException extends BaseException {
    protected String code;

    public JdbcActionException(String message, String code) {
        super(message);
        this.code = code;
    }

    @Override
    public String getCode() {
        return code;
    }
}

