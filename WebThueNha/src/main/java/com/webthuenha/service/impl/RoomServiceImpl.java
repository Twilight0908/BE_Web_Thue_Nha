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
        return iRoomRepo.save(room);
    }

    @Override
    public Room edit(Room room) {
        return iRoomRepo.save(room);
    }

    @Override
    public void delete(int id) {
        iRoomRepo.deleteById(id);
    }

    @Override
    public Room findById(int id) {

        return iRoomRepo.findById(id).get();
    }

    @Override
    public List<Room> getAll() {

        return (List<Room>) iRoomRepo.findAll();
    }

    @Override
    public List<Room> findAllByArea(int id) {
        return iRoomRepo.findAllByArea(id);
    }

    @Override
    public List<Room> findAllByCategory(int id) {
        return iRoomRepo.findAllByCategory(id);
    }
}
