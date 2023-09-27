package com.example.camping.repository;



import com.example.camping.domain.Camp;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository // 어노테이션 붙이기
public class MemoryCampRepositiory implements CampRepository{

    private static Map<Long,Camp> camping =new HashMap<>();
    private static Long sequence =0L;

    @Override
    public void save(Camp camp) {
        camp.setId(++sequence); // id생성하고 item에 저장
        camping.put(camp.getId(),camp);// camping에 저장
    }

    @Override
    public Camp findById(Long id) {
        return camping.get(id);
    }

    @Override
    public List<Camp> findAll() {
        return camping.values().stream().toList();
    }

    @Override
    public void updateById(Long id, Camp camp) {
        camping.put(id,camp);
    }

    @Override
    public void deleteById(Long id) {
        camping.remove(id);
    }
}
