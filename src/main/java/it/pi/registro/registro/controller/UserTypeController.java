package it.pi.registro.registro.controller;

import it.pi.registro.registro.entity.User;
import it.pi.registro.registro.entity.UserType;
import it.pi.registro.registro.service.UserService;
import it.pi.registro.registro.service.UserTypeService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserTypeController {
    private UserTypeService userTypeService;

    @GetMapping
    public ResponseEntity<List<UserType>> getAllUsers(){
      List<UserType> users = userTypeService.getAllUsersType();

      return new ResponseEntity<>(users, HttpStatus.OK);
    };

    @GetMapping("{id}")
    public ResponseEntity<UserType> getTypeUserById(@PathVariable("id") Long userId){
        UserType userType = userTypeService.getUserTypeById(userId);
        return new  ResponseEntity<>(user, HttpStatus.OK);
    };

    @PostMapping
    public ResponseEntity<UserType> createUserType(@Valid @RequestBody UserType userType){
        UserType savedUserType = userTypeService.createUserType(userType);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    /*@PutMapping("{id}")
    public ResponseEntity<UserType> updateUser(@PathVariable("id") Long userId, @RequestBody UserType userType){
        User updatedUser = userService.getUserById(userId);
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setEmail(user.getEmail());
        userService.updateUser(updatedUser);
        return new  ResponseEntity<>(updatedUser, HttpStatus.OK);
    }*/
}
