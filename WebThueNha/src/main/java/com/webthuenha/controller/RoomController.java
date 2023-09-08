package com.webthuenha.controller;

import com.webthuenha.model.Room;
import com.webthuenha.service.impl.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
@CrossOrigin("*")
public class RoomController {

    @Autowired
    RoomServiceImpl roomService;

    @GetMapping("/findAllByArea/{id}")
    public ResponseEntity<List<Room>> getAllRooms(@PathVariable int id) {
        List<Room> roomList = roomService.findAllByArea(id);
        if (roomList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(roomList);
    }

    @GetMapping("/findAllByCategory/{id}")
    public ResponseEntity<List<Room>> getAllRoomsByCategory(@PathVariable int id) {
        List<Room> roomList = roomService.findAllByCategory(id);
        if (roomList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(roomList);
    }

    @GetMapping
    public ResponseEntity<List<Room>> getAllRooms() {
        List<Room> roomList = roomService.getAll();
        if (roomList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(roomList);
    }
}
