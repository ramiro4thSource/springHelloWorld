package controller;

import db.UsersDb;
import models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    @ResponseBody
    public List<User> getUsers(@RequestParam(value="email",required = false) String email)
    {
        List<User> users = new ArrayList<User>();
        if(email==null) users= new UsersDb().getUsers();
        else users.add(new UsersDb().getUserByEmail(email));
        return  users;
    }
    //insertNewUser
    @RequestMapping(method = RequestMethod.POST, value="/users")
    public String insertUser(@RequestBody User newUser) throws SQLException
    {
        if(newUser.getFirstName()==null && newUser.getLastName()==null){
            throw new IllegalArgumentException("FirstName and lastName must not be null or empty");
        }
        return new UsersDb().insertNewUser(newUser);

    }
}
