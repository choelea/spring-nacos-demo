package tech.icoding.springnacosdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tech.icoding.springnacosdemo.model.User;
import tech.icoding.springnacosdemo.service.UserService;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {this.userService = userService;}

    @GetMapping("/user")
    @ResponseBody
    public User get(@RequestParam int id) {
        return userService.findById(id);
    }
}