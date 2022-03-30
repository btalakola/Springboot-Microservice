package com.ms.userservice.userservice.controller;

import com.ms.userservice.userservice.VO.UserDept;
import com.ms.userservice.userservice.entity.User;
import com.ms.userservice.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public User saveUser(@RequestBody User user){
        log.info("Inside Save User in UserController ");
        return userService.saveUser(user);
    }

    @GetMapping("/getUserWithDept/{id}")
    public UserDept getUserWithDept(@PathVariable("id") Long userId)
    {
        return userService.findUserWithDept(userId);
    }


}
