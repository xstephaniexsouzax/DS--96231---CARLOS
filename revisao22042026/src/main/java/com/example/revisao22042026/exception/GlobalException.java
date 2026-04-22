package com.example.revisao22042026.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String,Object>> handleRunTimeException(RuntimeException exception){
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(Map.of("Mensagem",exception.getMessage()));
    }


}

