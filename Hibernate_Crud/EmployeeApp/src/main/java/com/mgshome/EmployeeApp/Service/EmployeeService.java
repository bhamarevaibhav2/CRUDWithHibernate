package com.mgshome.EmployeeApp.Service;

import com.mgshome.EmployeeApp.Model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}
