package com.hai.baseapi;

import com.hai.entity.BaseUser;
import com.hai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haipv on 3/26/2018.
 *
 * @version 1.0
 */
@RestController
@RequestMapping("/api")
public class UserAPI {
    @Autowired
    private UserService userService;

    @RequestMapping(value ="/public")
//    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public List<String> getUser(){
        List<String> result = new ArrayList<>();
        result.add("TEST");
        result.add("TEST1");
        result.add("TEST2");
        return result;
    }

    @RequestMapping(value ="/secured/users", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public List<BaseUser> getUsers(){
        return userService.findAllUsers();
    }
}

