package com.sparta.week5project.daos.interfaces;

import com.sparta.week5project.dtos.EmployeeDTO;
import com.sparta.week5project.entities.Employee;

import java.util.List;

public interface EmployeeService extends DAO<EmployeeDTO>{
    List<Employee> findEmployeeByLastName(String lastname);

    void update(EmployeeDTO e,Integer id );
}
