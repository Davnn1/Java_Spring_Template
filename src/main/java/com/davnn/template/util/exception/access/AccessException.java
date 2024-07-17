package com.davnn.template.util.exception.access;

import com.davnn.template.util.exception.BaseException;

public abstract class AccessException extends BaseException {
    private String fieldCauseError;

    public AccessException(String code, String fieldCauseError) {
        super(fieldCauseError);
        this.fieldCauseError = fieldCauseError;
    }

    @Override
    public String getCode() {
        return null; // Implement logic to return the code
    }

    public String getFieldCauseError() {
        return fieldCauseError;
    }
}

