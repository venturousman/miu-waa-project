package waa.labs.waaproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import waa.labs.waaproject.models.User;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<User> getAllUsers() {
        System.out.println("Hello Users");
        return List.of();
    }
}
