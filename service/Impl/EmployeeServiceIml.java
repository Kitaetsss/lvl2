package lvl2.skypro.service.Impl;

import lvl2.skypro.exception.EmployeeOverFlowException;
import lvl2.skypro.model.Employee;
import lvl2.skypro.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public abstract class EmployeeServiceIml implements EmployeeService {
    private final List<Employee> employeesList;

    public EmployeeServiceIml(){
        this.employeesList = new ArrayList<>();
    }

    @Override
    public Employee add(String firstName, String lastName){
        Employee newEmployee = new Employee(firstName, lastName);
        return add(newEmployee);
    }

    @Override
    public Employee add(Employee employee){
        if(!employeesList.contains(employee)){
            throw new EmployeeOverFlowException();
        }
        employeesList.add(employee);

        return employee;

    }
    @Override
    public Employee remove(String firstName, String lastName){
        Employee newEmployee = new Employee(firstName, lastName);
        return remove(newEmployee);

    }
    @Override
    public Employee remove(Employee employee) {
        if (!employeesList.remove(employee)){
            throw new EmployeeOverFlowException();
        }
        return employee;
    }

    @Override
    public Employee find(String firstName, String lastName){
        Employee employee = null;
        if (!employeesList.contains(employee)) {
            throw new EmployeeOverFlowException();
        }
        return employee;
    }

    @Override
    public Collection<Employee> getAll() {
        return List.copyOf(employeesList);
    }
    public List<Employee> getEmployeesList() {
        return employeesList;
    }

    @Override
    public Collection<Employee> getall() {
        return employeesList;
    }
}