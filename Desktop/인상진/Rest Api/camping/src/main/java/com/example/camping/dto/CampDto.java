package com.example.camping.dto;

import com.example.camping.domain.Camp;
import lombok.Builder;
import lombok.Data;

@Data
public class CampDto {

    private Long id;
    private String name;
    private Long count;
    @Builder
    public CampDto(Long id, String name, Long count) {
        this.id=id;
        this.name=name;
        this.count=count;
    }

    public Camp toEntity() {
        return Camp.builder()
                .id(id)
                .name(name)
                .count(count)
                .build();
    }

}
