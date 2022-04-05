package lvl2.skypro.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INSUFFICIENT_STORAGE)
public class EmployeeExcistsExcetion {
    public static final class EmployeeExistsException extends RuntimeException {

        private static final String DEFAULT_MESSAGE = "Сотрудник уже есть в списке";

        public EmployeeExistsException() {
            this(DEFAULT_MESSAGE);
        }

        public EmployeeExistsException(String message) {
            super(message);
        }
    }
}
