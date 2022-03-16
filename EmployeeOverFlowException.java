package lvl2.skypro;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INSUFFICIENT_STORAGE)
public class EmployeeOverFlowException extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "Книга полная";
    public EmployeeOverFlowException() {
        this(DEFAULT_MESSAGE);
    }
    public EmployeeOverFlowException(String message){
        super(message);
    }
}
