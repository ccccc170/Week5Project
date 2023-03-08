package com.sparta.week5project.mappers;

import com.sparta.week5project.dtos.EmployeeDTO;
import com.sparta.week5project.entities.Employee;

public interface EmployeeMapper {

    EmployeeDTO employeeToDto(Employee employee);
    Employee dtoToEmployee(EmployeeDTO employeeDTO);

}
