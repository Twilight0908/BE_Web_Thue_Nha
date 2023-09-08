package com.webthuenha.repository;

import com.webthuenha.model.Area;
import com.webthuenha.model.Room;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IRoomRepo extends CrudRepository<Room, Integer> {
    // viet query tim kiem phong theo khu vuc theo dang sql
    @Query(value = "select * from room where area_id = ?1", nativeQuery = true)
    List<Room> findAllByArea(int id);

    // viet query tim kiem phong theo loai phong
    @Query(value = "select * from room where category_id = ?1", nativeQuery = true)
    List<Room> findAllByCategory(int id);
}
