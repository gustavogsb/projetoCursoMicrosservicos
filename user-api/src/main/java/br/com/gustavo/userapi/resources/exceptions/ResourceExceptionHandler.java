package br.com.gustavo.userapi.resources.exceptions;
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import br.com.gustavo.userapi.services.exceptions.ObjectNotFoundExcepetion;
import jakarta.servlet.http.HttpServletRequest;


@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundExcepetion.class)
    public ResponseEntity <StandardError> objectNotFound(ObjectNotFoundExcepetion ex, HttpServletRequest request){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
            new StandardError(  LocalDateTime.now(), 
                                ex.getMessage(), 
                                HttpStatus.NOT_FOUND.value(), 
                                request.getRequestURI())
            
        );

    }
    
}
