package com.webthuenha.model.dto;

import com.webthuenha.config.SecurityConfig;
import com.webthuenha.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.context.SecurityContextHolder;

@Data
@AllArgsConstructor
public class AccountToken {
    private int id;
    private String username;
    private String token;
    private Role role;
}
