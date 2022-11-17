package com.example.employee;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmpRepo extends JpaRepository<EmployeeModel, Integer> {
}
