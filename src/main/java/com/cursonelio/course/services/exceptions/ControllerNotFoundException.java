package com.cursonelio.course.services.exceptions;

public class ControllerNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ControllerNotFoundException(Object id){
        super("User not found, Id " + id);
    }
}
