package com.webthuenha.service.impl;

import com.webthuenha.model.Account;
import com.webthuenha.repository.IAccountRepo;
import com.webthuenha.service.iService.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountRepo iAccountRepo;

    @Override
    public Account findByUsername(String username) {
        return iAccountRepo.findByUsername(username);
    }

    @Override
    public Account save(Account account) {
        return iAccountRepo.save(account);
    }

    @Override
    public Account edit(Account account) {
        return iAccountRepo.save(account);
    }

    @Override
    public void delete(int id) {
        iAccountRepo.deleteById(id);
    }

    @Override
    public Account findById(int id) {
        return iAccountRepo.findById(id).get();
    }

    @Override
    public List<Account> getAll() {
        return (List<Account>) iAccountRepo.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = iAccountRepo.findByUsername(username);
        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(account.getRole());
        return new User(username, account.getPassword(), roles);
    }
}
