package com.example.ProjetoCurso.services.exceptions;

public class AuthorizationException extends RuntimeException {

    public AuthorizationException(String msg){
        super(msg);
    }
     public AuthorizationException(String msg, Throwable cause)
     {
        super(msg, cause);
     }
}
