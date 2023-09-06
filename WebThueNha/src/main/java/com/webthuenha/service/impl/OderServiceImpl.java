package com.webthuenha.service.impl;

import com.webthuenha.model.Oder;
import com.webthuenha.repository.IOderRepo;
import com.webthuenha.service.iService.IOderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OderServiceImpl implements IOderService {
    @Autowired
    private IOderRepo iOderRepo;

    @Override
    public Oder save(Oder oder) {
        return null;
    }

    @Override
    public Oder edit(Oder oder) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Oder findById(int id) {
        return null;
    }

    @Override
    public List<Oder> getAll() {
        return null;
    }
}
