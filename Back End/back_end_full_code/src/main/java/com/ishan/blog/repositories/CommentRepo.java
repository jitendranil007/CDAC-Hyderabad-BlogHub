package com.ishan.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ishan.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
