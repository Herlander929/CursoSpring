package com.example.ProjetoCurso.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
    private List<FieldMessage> List = new ArrayList<>();

    public ValidationError(Integer status, String msg, Long timeStamp) {
        super(status, msg, timeStamp);
    }

    public List<FieldMessage> getLista() {
        return List;
    }

    public void addError(String fieldName, String message){
        List.add(new FieldMessage(fieldName, message));
    }
}
