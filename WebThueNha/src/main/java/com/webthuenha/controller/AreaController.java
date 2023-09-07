package com.webthuenha.controller;

import com.webthuenha.model.Area;
import com.webthuenha.service.impl.AreaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/area")
public class AreaController {
    @Autowired
    AreaServiceImpl areaService;

    @GetMapping
    public ResponseEntity<List<Area>> getAll(){
        List<Area> areaList = areaService.getAll();
        if (areaList.isEmpty()){
            // tra ve loi 204
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.ok(areaList);
    }

    @PostMapping("/create")
    public ResponseEntity<Area> addArea(@RequestBody Area area){
        return new ResponseEntity<>(areaService.save(area), HttpStatus.CREATED);
    }

    @GetMapping("/edit/{id}")
    public ResponseEntity<Area> getAccount(@PathVariable int id) {
        Area currentArea = areaService.findById(id);
        if (currentArea == null) {
            return ResponseEntity.status(204).build();
        }
        return new ResponseEntity<>(currentArea, HttpStatus.OK);
    }

    @PostMapping("/edit/{id}")
    public ResponseEntity<Area> editAccount(@RequestBody Area area, @PathVariable int id) {
        Area currentArea = areaService.findById(id);
        if (currentArea == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

//        currentArea.setId(area.getId());
        currentArea.setName(area.getName());

        return new ResponseEntity<>(areaService.edit(currentArea), HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<Area> deleteAccount(@PathVariable int id) {
        if (areaService.findById(id) == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        areaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
