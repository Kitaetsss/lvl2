package lvl2.skypro.service.Impl;

import lvl2.skypro.exception.EmployeeExcistsExcetion;
import lvl2.skypro.exception.EmployeeNotFoundException;
import lvl2.skypro.exception.EmployeeOverFlowException;
import lvl2.skypro.model.Employee;
import lvl2.skypro.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceIml implements EmployeeService {
    private final Map<String, Employee> employeesBook;

    public EmployeeServiceIml(){
        employeesBook = new HashMap<>();
    }

    @Override
    public Employee add(String firstName, String lastName){
        String key = getKey(firstName, lastName);

        if(employeesBook.containsKey(key)) {
            throw new EmployeeExcistsExcetion.EmployeeExistsException("Сотрудник уже есть в списке");
        }
        Employee newEmployee = new Employee(firstName, lastName);
        employeesBook.put(key, newEmployee);
        return newEmployee;
    }

    @Override
    public Employee remove(String firstName, String lastName){
        String key = getKey(firstName, lastName);

        if(employeesBook.remove(key) == null) {
            throw new EmployeeNotFoundException("Сотрудника нет в списке");
        }
        Employee removedEmployee = new Employee(firstName, lastName);
        return removedEmployee;
    }

    @Override
    public Employee find(String firstName, String lastName){
        String key = getKey(firstName, lastName);

        Employee employee = employeesBook.get(key);
        if(employee == null) {
            throw new EmployeeNotFoundException("Сотрудника нет в списке");
        }
        return employee;
    }

    @Override
    public Collection<Employee> getAll() {
        return Collections.unmodifiableCollection(employeesBook.values());
    }
    private String getKey(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}