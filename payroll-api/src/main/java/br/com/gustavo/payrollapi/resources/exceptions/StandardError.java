package br.com.gustavo.payrollapi.resources.exceptions;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter

public class StandardError {

    private LocalDateTime timestemp;
    private String error;
    private Integer status;
    private String path;

    public StandardError(LocalDateTime timestemp, String error, Integer status, String path) {
        this.timestemp = timestemp;
        this.error = error;
        this.status = status;
        this.path = path;
    }

    
}
