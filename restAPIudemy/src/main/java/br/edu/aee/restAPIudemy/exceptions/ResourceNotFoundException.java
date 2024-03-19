package br.edu.aee.restAPIudemy.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String ex) {

        super(ex);
    }

    @Serial
    private static final long serialVersionUID = 1L;
}
