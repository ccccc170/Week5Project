package com.sparta.week5project.daos.interfaces;

import com.sparta.week5project.dtos.DeptManagerDTO;
import com.sparta.week5project.entities.DeptManagerId;

import java.util.Optional;

public interface DepartmentManagerService <T> {
    Optional<T> findById(DeptManagerId id);

    DeptManagerDTO
    save(DeptManagerDTO e);

    void update(DeptManagerDTO e, DeptManagerId id);

    void deleteById(DeptManagerId id);
}
