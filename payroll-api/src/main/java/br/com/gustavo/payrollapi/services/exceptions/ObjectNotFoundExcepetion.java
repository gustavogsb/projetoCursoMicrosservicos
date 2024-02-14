package br.com.gustavo.payrollapi.services.exceptions;

public class ObjectNotFoundExcepetion extends RuntimeException {
    
    public ObjectNotFoundExcepetion(String message){
        super(message);
    }

}
