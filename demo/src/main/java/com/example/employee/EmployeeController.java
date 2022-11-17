package com.example.employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {

    private EmployeeMService empService;

    @GetMapping("/getAll")
    public List<EmployeeModel> listAll(){
        return empService.listAll();
    }

    @PostMapping("/add")
    public EmployeeModel add(EmployeeModel tmp) throws Exception {

        EmployeeModel employeeModel = empService.addEmp(tmp);
        if(employeeModel == null) throw new Exception("An employee with this ID is already listed!");
        return employeeModel;
    }

    @GetMapping("/find{id}")
    public EmployeeModel find(@PathVariable int id){
        return empService.findEmp(id);
    }

}