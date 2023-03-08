package com.sparta.week5project.daos.interfaces;

import com.sparta.week5project.dtos.TitleDTO;
import com.sparta.week5project.entities.TitleId;

import java.util.Optional;

public interface TitleService<T> {

    Optional<T> findById(TitleId id);

    TitleDTO save(TitleDTO e);

    void update(TitleDTO e,TitleId id);

    void deleteById(TitleId id);
}
