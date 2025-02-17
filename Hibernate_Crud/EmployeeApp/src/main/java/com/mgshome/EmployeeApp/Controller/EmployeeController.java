package com.mgshome.EmployeeApp.Controller;

import java.util.List;

import com.mgshome.EmployeeApp.Model.Employee;
import com.mgshome.EmployeeApp.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employeeObj) {
        employeeService.save(employeeObj);
        return employeeObj;
    }

    @GetMapping("/employee")
    public List<Employee> get(){
        return employeeService.get();
    }

    @GetMapping("/employee/{id}")
    public Employee get(@PathVariable int id) {
        Employee employeeObj = employeeService.get(id);
        if(employeeObj == null) {
            throw new RuntimeException("Employee not found for the Id:"+id);
        }
        return employeeObj;
    }

    @PutMapping("/employee")
    public Employee update(@RequestBody Employee employeeObj) {
        employeeService.save(employeeObj);
        return employeeObj;
    }

    @DeleteMapping("/employee/{id}")
    public String delete(@PathVariable int id) {
        employeeService.delete(id);
        return "Employee has been deleted with id:"+id;
    }
}
