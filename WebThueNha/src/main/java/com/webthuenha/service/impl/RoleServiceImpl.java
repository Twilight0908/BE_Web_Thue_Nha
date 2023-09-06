package com.webthuenha.service.impl;

import com.webthuenha.model.Role;
import com.webthuenha.repository.IRoleRepo;
import com.webthuenha.service.iService.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private IRoleRepo iRoleRepo;

    @Override
    public Role save(Role role) {
        return iRoleRepo.save(role);
    }

    @Override
    public Role edit(Role role) {
        return iRoleRepo.save(role);
    }

    @Override
    public void delete(int id) {
        iRoleRepo.deleteById(id);
    }

    @Override
    public Role findById(int id) {
        return iRoleRepo.findById(id).get();
    }

    @Override
    public List<Role> getAll() {
        return (List<Role>) iRoleRepo.findAll();
    }
}
