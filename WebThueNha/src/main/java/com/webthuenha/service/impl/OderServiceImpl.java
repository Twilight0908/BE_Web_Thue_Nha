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
        return iOderRepo.save(oder);
    }

    @Override
    public Oder edit(Oder oder) {
        return iOderRepo.save(oder);
    }

    @Override
    public void delete(int id) {
        iOderRepo.deleteById(id);
    }

    @Override
    public Oder findById(int id) {
        return iOderRepo.findById(id).get();
    }

    @Override
    public List<Oder> getAll() {
        return (List<Oder>) iOderRepo.findAll();
    }
}
