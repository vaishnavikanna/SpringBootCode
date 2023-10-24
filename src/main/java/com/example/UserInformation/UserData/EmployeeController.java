package com.example.UserInformation.UserData;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/getEmployees")
    public ResponseEntity<?> getUser() {

        List<Employee> employees = employeeRepository.findAll();

        return new ResponseEntity(employees, HttpStatus.OK);
    }

    @PostMapping("/registration")
    public ResponseEntity<Employee> registerUser(@Valid @RequestBody EmployeeModel employeeModel) {
        // get the data given by user/ data given to postman
        Employee employee = new Employee(
                employeeModel.getName(),
                employeeModel.getDesignation(),
                employeeModel.getSalary()
        );
        //save data given by user
        Employee storedEmployee = employeeRepository.save(employee);
        // return the saved data and an Okay.
        return new ResponseEntity(storedEmployee, HttpStatus.OK);
    }
}
