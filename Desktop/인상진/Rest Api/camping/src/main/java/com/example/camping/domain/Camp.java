package com.example.camping.domain;

import com.example.camping.dto.CampDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Camp {
    private Long id; // 방 번호
    private String name; // 방 종류
    private Long count; // 남은 방 개수

    @Builder
    public Camp(Long id, String name, Long count){
        this.id =id;
        this.name = name;
        this.count = count;
    }

    public void setId(Long id){
        this.id =id;
    }

    public CampDto toDto() {
        return CampDto.builder()
                .id(id)
                .name(name)
                .count(count)
                .build();
    }




}
