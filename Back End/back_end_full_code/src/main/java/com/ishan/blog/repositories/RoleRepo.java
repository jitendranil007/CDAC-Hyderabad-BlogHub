package com.ishan.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ishan.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
