package com.userPortal.dao;

import org.springframework.data.repository.CrudRepository;

import com.userPortal.model.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
