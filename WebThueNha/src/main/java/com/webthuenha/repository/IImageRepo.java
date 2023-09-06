package com.webthuenha.repository;

import com.webthuenha.model.Image;
import org.springframework.data.repository.CrudRepository;

public interface IImageRepo extends CrudRepository<Image, Integer> {
}
