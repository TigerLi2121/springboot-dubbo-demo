package com.mm.api;

import com.mm.pojo.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserServiceRemoteApi userService;

    @PostMapping("/save")
    public int save(User pojo) {
        return userService.save(pojo);
    }

    @GetMapping("/get")
    public User get(Long id) {
        return userService.get(id);
    }

    @PostMapping("/update")
    public int update(User pojo) {
        return userService.update(pojo);
    }

}
