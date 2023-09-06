package com.webthuenha.repository;

import com.webthuenha.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface IAccountRepo extends CrudRepository<Account, Integer> {
    Account findByUsername(String username);
}
