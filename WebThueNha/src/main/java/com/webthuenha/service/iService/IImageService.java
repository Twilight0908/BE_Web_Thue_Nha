package com.webthuenha.service.iService;

import com.webthuenha.model.Image;

import java.util.List;

public interface IImageService extends IService<Image> {
    List<Image> findAllByIdRoom(int idRoom);
}
