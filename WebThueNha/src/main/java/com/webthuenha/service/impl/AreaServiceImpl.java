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
        return iAreaRepo.save(area);
    }

    @Override
    public Area edit(Area area) {
        return iAreaRepo.save(area);
    }

    @Override
    public void delete(int id) {
        iAreaRepo.deleteById(id);
    }

    @Override
    public Area findById(int id) {
        return iAreaRepo.findById(id).get();
    }

    @Override
    public List<Area> getAll() {
        return (List<Area>) iAreaRepo.findAll();
    }
}
