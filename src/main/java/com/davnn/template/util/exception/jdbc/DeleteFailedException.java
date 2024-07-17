package com.davnn.template.util.exception.jdbc;

public class DeleteFailedException extends JdbcActionException {
    public DeleteFailedException(String message) {
        super(message, "409-03-03");
    }
}
