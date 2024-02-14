package br.com.gustavo.userapi.services.exceptions;

public class ObjectNotFoundExcepetion extends RuntimeException {
    
    public ObjectNotFoundExcepetion(String message){
        super(message);
    }

}
