package com.sam.employee.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message){
        super(message);
    }

}
