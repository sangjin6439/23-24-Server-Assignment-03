package com.example.camping.service;

import com.example.camping.domain.Camp;
import com.example.camping.dto.CampDto;
import com.example.camping.repository.CampRepository;
import com.example.camping.repository.MemoryCampRepositiory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //어노테이션 붙이기
public class CampService  {

    private final CampRepository campRepository;

    public CampService(CampRepository campRepository) {
        this.campRepository = campRepository;
    }

    public void saveCamp(CampDto campDto) {
        Camp camp = campDto.toEntity();

        campRepository.save(camp);
    }

    public CampDto findcampById(Long id) {
        Camp camp= campRepository.findById(id);

        return CampDto.builder()
                .id(camp.getId())
                .name(camp.getName())
                .count(camp.getCount())
                .build();
    }

    public List<CampDto> findAllcamp() {
        return campRepository.findAll()
                .stream()
                .map(Camp::toDto)
                .toList();
    }

    public void updateById(Long id, CampDto campDto) {
        Camp camp = campDto.toEntity();
        camp.setId(id);

        campRepository.findAll();
    }

    public void deleteById(Long id) {
      campRepository.deleteById(id);
    }
}
