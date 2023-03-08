package com.sparta.week5project.mappers;



import com.sparta.week5project.dtos.SalaryDTO;
import com.sparta.week5project.entities.Salary;

public interface SalaryMapper {
    SalaryDTO salaryToDTO(Salary salary);
    Salary dtoToSalary(SalaryDTO salaryDTO);
}
