package com.example.Aula_05._5._6.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptional {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, String>>runtimeException(RuntimeException erro){
        return ResponseEntity
                .status((HttpStatus.CONFLICT))
                .body((Map.of("Mensagem", erro.getMessage())));
    }
}
