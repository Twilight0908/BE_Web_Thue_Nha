package com.webthuenha.model.dto;

import com.webthuenha.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountToken {
    private int id;
    private String username;
    private String token;
    private Role role;
}
