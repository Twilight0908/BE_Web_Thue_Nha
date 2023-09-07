package com.webthuenha.service.impl;

import com.webthuenha.model.Area;
import com.webthuenha.repository.IAreaRepo;
import com.webthuenha.service.iService.IAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements IAreaService {
    @Autowired
    private IAreaRepo iAreaRepo;

    @Override
    public Area save(Area area) {
        return null;
    }

    @Override
    public Area edit(Area area) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Area findById(int id) {
        return null;
    }

    @Override
    public List<Area> getAll() {
        return null;
    }
}
