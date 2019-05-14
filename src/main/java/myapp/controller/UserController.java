package myapp.controller;

import myapp.models.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.*;
import myapp.models.UserRepository;
import org.springframework.web.server.ResponseStatusException;

import java.sql.SQLException;
import java.util.Map;

@RunWith(SpringRunner.class)
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    @ResponseBody
    public Iterable<User> getUsers(@RequestParam Map<String,String> queryParams) throws Exception {

        if (queryParams.containsKey("email") && queryParams.get("email")!= null)
            return userRepository.findByEmail(queryParams.get("email"));
        else if (queryParams.containsKey("firstName") && queryParams.get("firstName")!= null)
            return userRepository.findByFirstName(queryParams.get("firstName"));
        else if (queryParams.containsKey("lastName") && queryParams.get("lastName")!= null)
            return userRepository.findByLastName(queryParams.get("lastName"));
        else{
            return userRepository.findAll();
        }
    }

    @DeleteMapping("/users/{id}")
    @ResponseBody
    public void deleteUsers(@PathVariable Integer id){
        userRepository.deleteById(id);
    }
    //insertNewUser
    @PostMapping("/users")
    @ResponseBody
    public User insertUser(@RequestBody User user) throws SQLException {
        return userRepository.save(user);
    }
}
