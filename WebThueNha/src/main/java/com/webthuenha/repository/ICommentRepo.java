package com.webthuenha.repository;

import com.webthuenha.model.Comment;
import org.springframework.data.repository.CrudRepository;

public interface ICommentRepo extends CrudRepository<Comment, Integer> {
}
