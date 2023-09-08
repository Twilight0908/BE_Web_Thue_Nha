package com.webthuenha.repository;

import com.webthuenha.model.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IAccountRepo extends CrudRepository<Account, Integer> {
    Account findByUsername(String username);
    @Query(
    value="select COUNT(*) from Account where username = :checkUsername")
    int checkAccountUsername(@Param("checkUsername")String checkUsername);
}
