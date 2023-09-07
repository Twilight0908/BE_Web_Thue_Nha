package com.webthuenha.service.impl;

import com.webthuenha.model.Comment;
import com.webthuenha.repository.ICommentRepo;
import com.webthuenha.service.iService.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements ICommentService {
    @Autowired
    private ICommentRepo iCommentRepo;

    @Override
    public Comment save(Comment comment) {
        return null;
    }

    @Override
    public Comment edit(Comment comment) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Comment findById(int id) {
        return null;
    }

    @Override
    public List<Comment> getAll() {
        return null;
    }
}
