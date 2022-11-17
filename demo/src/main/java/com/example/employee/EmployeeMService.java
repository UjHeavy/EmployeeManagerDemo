package com.example.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeMService {
    public EmployeeMService(){}

    private EmpRepo empRepo;

    public EmployeeModel addEmp(EmployeeModel tmp){
        return empRepo.save(tmp);
    }

    public EmployeeModel findEmp(int id){

        Optional<EmployeeModel> employeeModel = empRepo.findById(id);
        return employeeModel.orElse(null);
    }

    public List<EmployeeModel> listAll(){
        return new ArrayList<>(empRepo.findAll());
    }
}
