package org.blitmatthew.BankingApi.shared.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.blitmatthew.BankingApi.accounts.exception.AccountActiveException;
import org.blitmatthew.BankingApi.accounts.exception.BankAccountNotFoundException;
import org.blitmatthew.BankingApi.shared.dto.ApiError;
import org.blitmatthew.BankingApi.user_profile.exception.UserProfileNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class DefaultExceptionHandler {

    @ExceptionHandler({UserProfileNotFoundException.class, BankAccountNotFoundException.class})
    public ResponseEntity<ApiError> exceptionHandler(
            Exception e,
            HttpServletRequest request
    ) {
        ApiError apiError = new ApiError(
                request.getRequestURI(),
                e.getMessage(),
                HttpStatus.NOT_FOUND.value(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({AccountActiveException.class})
    public ResponseEntity<ApiError> exceptionHandler(
            AccountActiveException e,
            HttpServletRequest request
    ) {
        ApiError apiError = new ApiError(
                request.getRequestURI(),
                e.getMessage(),
                HttpStatus.BAD_REQUEST.value(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(apiError, HttpStatus.BAD_REQUEST);
    }
}
