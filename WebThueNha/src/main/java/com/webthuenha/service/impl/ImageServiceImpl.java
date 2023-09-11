package com.webthuenha.service.impl;

import com.webthuenha.model.Image;
import com.webthuenha.repository.IImageRepo;
import com.webthuenha.service.iService.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements IImageService {
    @Autowired
    private IImageRepo iImageRepo;

    @Override
    public Image save(Image image) {
        return iImageRepo.save(image);
    }

    @Override
    public Image edit(Image image) {
        return iImageRepo.save(image);
    }

    @Override
    public void delete(int id) {
        iImageRepo.deleteById(id);
    }

    @Override
    public Image findById(int id) {
        return iImageRepo.findById(id).get();
    }

    @Override
    public List<Image> getAll() {
        return (List<Image>) iImageRepo.findAll();
    }

    @Override
    public List<Image> findAllByIdRoom(int idRoom) {
        return iImageRepo.findAllByIdRoom(idRoom);
    }
}
