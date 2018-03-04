package com.ssmdemo.dao;

import com.ssmdemo.entity.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IUserDao {

    public User findUserById(int id) throws Exception;

}
