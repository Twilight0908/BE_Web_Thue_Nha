package com.webthuenha.controller;

import com.webthuenha.model.Account;
import com.webthuenha.model.Oder;
import com.webthuenha.model.Room;
import com.webthuenha.model.UserRoomObject;
import com.webthuenha.repository.IOderRepo;
import com.webthuenha.service.iService.IAccountService;
import com.webthuenha.service.iService.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
@RestController
@CrossOrigin("*")
@RequestMapping("/oder")
public class OderController {
    @Autowired
    IRoomService iRoomService;
    @Autowired
    IAccountService iAccountService;

    @Autowired
    IOderRepo iOderRepo;

    @PostMapping("/oderRoom")
    public ResponseEntity<Oder> roomInfoReceived(@RequestBody UserRoomObject userRoomObject) {
        Room room = iRoomService.findById(userRoomObject.getRoomID());
        Account account = iAccountService.findById(userRoomObject.getUserID());
        System.out.println(room);
        System.out.println(account);
        Oder oder = new Oder();
        oder.setDateStart(LocalDate.now());
        oder.setTotalPrice(room.getPrice()*userRoomObject.getNumberOfMonths());
        oder.setNumberOfMonths(userRoomObject.getNumberOfMonths());
        oder.setAccount(account);
        oder.setRoom(room);
        oder.setPresentPrice(room.getPrice());
        iOderRepo.save(oder);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
