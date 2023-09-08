package com.webthuenha.service.impl;

import com.webthuenha.model.Room;
import com.webthuenha.repository.IRoomRepo;
import com.webthuenha.service.iService.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements IRoomService {
    @Autowired
    private IRoomRepo iRoomRepo;

    @Override
    public Room save(Room room) {
        return null;
    }

    @Override
    public Room edit(Room room) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Room findById(int id) {
        return null;
    }

    @Override
    public List<Room> getAll() {

        return (List<Room>) iRoomRepo.findAll();
    }

    public List<Room> findAllByArea(int id) {
        List<Room> rooms = iRoomRepo.findAllByArea(id);
        return rooms;
    }

    public List<Room> findAllByCategory(int id) {
        List<Room> rooms = iRoomRepo.findAllByCategory(id);
        return rooms;
    }
}
