package com.lu.springmybatis.mapper;

import com.lu.springmybatis.entity.User;

import java.util.List;

public interface UserMapper {
    public void insert(User user);

    public void delete(Long id);

    public void update(User user);

    public User get(Long id);

    public List<User> findAll();
}
