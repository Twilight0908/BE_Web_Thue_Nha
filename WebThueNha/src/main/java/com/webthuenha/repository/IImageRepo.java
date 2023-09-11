package com.webthuenha.repository;

import com.webthuenha.model.Image;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IImageRepo extends CrudRepository<Image, Integer> {
    @Query(nativeQuery = true,value="select i.name from image i where room_id = :roomID")
    List<String> findImageByRoomID(@Param("roomID")int roomID);
    // viet cau query lay tat ca cac anh theo id phong
    // lay tat ca truong name trong bang image bang id phong
//    @Query(value = "select * from image where room_id = ?1", nativeQuery = true)
//    List<Image> findAllByIdRoom(int idRoom);

    // select image.name from image where room_id = ?1
    // select * from image where room_id = ?1
    @Query(value = "select * from image where room_id = ?1", nativeQuery = true)
    List<Image> findAllByIdRoom(int idRoom);
}
