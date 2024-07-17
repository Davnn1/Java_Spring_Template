package com.davnn.template.util.exception.conflict;

import com.davnn.template.util.exception.BaseException;

public abstract class ConflictException extends BaseException {
    protected String fieldCauseError;

    public ConflictException(String code, String fieldCauseError) {
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

