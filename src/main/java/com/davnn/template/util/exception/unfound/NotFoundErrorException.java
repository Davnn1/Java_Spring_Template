package com.davnn.template.util.exception.unfound;

import com.davnn.template.util.exception.BaseException;

public abstract class NotFoundErrorException extends BaseException {
    protected String code;

    public NotFoundErrorException(String code) {
        super(null); // Assuming the BaseException's msg is not used here
        this.code = code;
    }

    @Override
    public String getCode() {
        return code;
    }
}
