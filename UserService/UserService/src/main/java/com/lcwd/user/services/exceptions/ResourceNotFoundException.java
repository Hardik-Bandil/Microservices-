package com.lcwd.user.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException() {
        System.out.println("Resource not found server");

    }

    public ResourceNotFoundException(String message){
        super(message);
    }

    
}
