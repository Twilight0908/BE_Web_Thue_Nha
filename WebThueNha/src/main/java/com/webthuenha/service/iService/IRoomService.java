package com.webthuenha.service.iService;

import com.webthuenha.model.Room;

import java.util.List;

public interface IRoomService extends IService<Room> {
    List<Room> findAllByArea(int id);

    List<Room> findAllByCategory(int id);
}
