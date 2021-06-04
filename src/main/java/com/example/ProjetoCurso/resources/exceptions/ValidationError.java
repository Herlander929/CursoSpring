package com.example.ProjetoCurso.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
    private List<FieldMessage> List = new ArrayList<>();

    public ValidationError(Long timestamp, Integer status, String error, String message, String path) {
        super(timestamp, status, error, message, path);

    }

    public List<FieldMessage> getLista() {
        return List;
    }

    public void addError(String fieldName, String message){
        List.add(new FieldMessage(fieldName, message));
    }
}
