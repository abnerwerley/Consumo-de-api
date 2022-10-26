package com.kitsu.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@ResponseStatus(value = HttpStatus.OK)
public class RequestException extends RuntimeException{

    private final String message;

    public RequestException(String message){
        this.message = message;
    }
}
