package kz.uib.market.api.controllers;

import kz.uib.market.api.models.Product;
import kz.uib.market.api.models.User;
import kz.uib.market.api.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> getAll(@RequestParam String login) {
        return userService.getAll(login);
    }
}

