package lvl2.skypro.service.impl;

import lvl2.skypro.exception.EmployeeOverFlowException;
import lvl2.skypro.model.Employee;
import lvl2.skypro.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceIml implements EmployeeService {
    private final list<Employee> employeesList;
    private final HashSet<Employee> employees;

    private int size;

    public EmployeeServiceIml(){
        employees = new HashSet<>();
        employeesList = (list<Employee>) new ArrayList<Object>();
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
        return Set.copyOf(employees);
    }

    @Override
    public Collection<Employee> getAll(String firstName, String lastName) {
        return null;
    }

    @Override
    public Collection<Employee> getAll(Employee employee) {
        return null;
    }

    @Override
    public Collection<Employee> getall(){
        Collection<? extends Employee> employees = null;
        return List.copyOf(employees);
    }
}
