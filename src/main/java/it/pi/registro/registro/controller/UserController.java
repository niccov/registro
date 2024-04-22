package it.pi.registro.registro.controller;

import it.pi.registro.registro.dto.UserCreateDTO;
import it.pi.registro.registro.entity.User;
import it.pi.registro.registro.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
      List<User> users = userService.getAllUsers();

      return new ResponseEntity<>(users, HttpStatus.OK);
    };

    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId){
        User user = userService.getUserById(userId);
        return new  ResponseEntity<>(user, HttpStatus.OK);
    };

    @PostMapping
    public ResponseEntity<User> createUser(@Valid @RequestBody User user){
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @PostMapping("/withDetails")
    public ResponseEntity<User> createUserWithDetails(@Valid @RequestBody User user){
        User savedUser = userService.createUserWithDetails(userCreateDTO);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Long userId, @RequestBody User user){
        User updatedUser = userService.getUserById(userId);
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setEmail(user.getEmail());
        userService.updateUser(updatedUser);
        return new  ResponseEntity<>(updatedUser, HttpStatus.OK);
    }
}
