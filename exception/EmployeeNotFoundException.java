package lvl2.skypro.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INSUFFICIENT_STORAGE)
    public class EmployeeNotFoundException extends RuntimeException {

    private static final String DEFAULT_MESSAGE = "Сотрудника нет в списке";

    public EmployeeNotFoundException() {
        this(DEFAULT_MESSAGE);
    }

    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
