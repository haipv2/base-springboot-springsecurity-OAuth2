package com.hai.service;

import com.hai.entity.BaseUser;

import java.util.List;

/**
 * Created by haipv on 3/26/2018.
 *
 * @version 1.0
 */
public interface UserService {
    List<BaseUser> findAllUsers();
}
