package com.example.revisao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GlobalException {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, String>> runtimeException(RuntimeException exception){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Erro: ", exception.getMessage()));
    }
}
