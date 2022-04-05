package lvl2.skypro.service;

import lvl2.skypro.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firstName, String lastName);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    Collection<Employee> getAll();

}
