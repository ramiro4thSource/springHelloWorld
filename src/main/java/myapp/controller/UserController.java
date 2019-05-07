package myapp.controller;

import myapp.models.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.*;
import myapp.models.UserRepository;

import java.sql.SQLException;

@RunWith(SpringRunner.class)
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    @ResponseBody
    public Iterable<User> getUsers(@RequestParam(value="email",required = false) String email)
    {
        return userRepository.findAll();
    }
    //insertNewUser
    @RequestMapping(method = RequestMethod.POST, value="/users")
    public User insertUser(@RequestBody User x) throws SQLException
    {
        return userRepository.save(x);
    }
}
