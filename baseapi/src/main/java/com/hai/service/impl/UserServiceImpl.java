package com.hai.service.impl;

import com.hai.entity.BaseUser;
import com.hai.repository.UserRepository;
import com.hai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by haipv on 3/26/2018.
 *
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<BaseUser> findAllUsers() {
        return userRepository.findAll();
    }
}
