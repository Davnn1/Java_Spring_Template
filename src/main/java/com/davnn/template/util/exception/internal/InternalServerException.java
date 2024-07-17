package com.davnn.template.util.exception.internal;

import com.davnn.template.util.exception.BaseException;

public abstract class InternalServerException extends BaseException {
    protected String code;
    protected String causeError;

    public InternalServerException(String code, String causeError) {
        super(causeError);
        this.code = code;
        this.causeError = causeError;
    }

    @Override
    public String getCode() {
        return code;
    }

    public String getCauseError() {
        return causeError;
    }
}

