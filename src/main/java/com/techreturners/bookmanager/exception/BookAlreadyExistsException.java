package com.techreturners.bookmanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_MODIFIED, reason = "Book already exists.")
public class BookAlreadyExistsException extends RuntimeException{
}
