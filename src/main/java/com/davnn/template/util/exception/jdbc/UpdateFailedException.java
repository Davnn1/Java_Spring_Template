package com.davnn.template.util.exception.jdbc;

public class UpdateFailedException extends JdbcActionException {
    public UpdateFailedException(String message) {
        super(message, "409-03-01");
    }
}
