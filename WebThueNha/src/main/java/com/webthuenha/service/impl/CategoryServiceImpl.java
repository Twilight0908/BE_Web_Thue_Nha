package com.webthuenha.service.impl;

import com.webthuenha.model.Category;
import com.webthuenha.repository.ICategoryRepo;
import com.webthuenha.service.iService.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryRepo iCategoryRepo;

    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public Category edit(Category category) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Category findById(int id) {
        return null;
    }

    @Override
    public List<Category> getAll() {
        return null;
    }
}
