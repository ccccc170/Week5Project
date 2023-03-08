package com.sparta.week5project.mappers;

import com.sparta.week5project.dtos.DeptEmpDTO;
import com.sparta.week5project.entities.DeptEmp;

public interface DeptEmpMapper {
    DeptEmpDTO deptEmpToDTO(DeptEmp deptEmp);
    DeptEmp dtoToDeptEmp(DeptEmpDTO deptEmpDTO);
}
