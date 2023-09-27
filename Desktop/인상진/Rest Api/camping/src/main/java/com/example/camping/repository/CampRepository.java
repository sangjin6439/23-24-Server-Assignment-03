package com.example.camping.repository;

import com.example.camping.domain.Camp;

import java.util.List;

public interface CampRepository {
    void save(Camp camp);
    Camp findById(Long id);
    List<Camp> findAll();
    void updateById(Long id,Camp camp);
    void deleteById(Long id);
}
