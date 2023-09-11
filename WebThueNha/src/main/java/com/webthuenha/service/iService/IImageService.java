package com.webthuenha.service.iService;

import com.webthuenha.model.Image;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IImageService extends IService<Image> {
    List<String> findImageByRoomID(int roomID);
    List<Image> findAllByIdRoom(int idRoom);
}
