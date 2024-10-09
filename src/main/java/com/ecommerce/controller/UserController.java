package com.ecommerce.controller;
import com.ecommerce.dtos.ApiResponseMessage;
import com.ecommerce.dtos.UserDto;
import com.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//Handle the request from UI side
//Controller (MVC Project) = model and view format , in model our data present in key and pair value,
// view is noting but Frontend pages.

//RestController= Controller + Responsebody = Number of format (json,xml,text,html) Rest API.

// controller , service , Repository, RestController, Component(base Annotation) -- Class Level

//Bean -- Method Level

@RestController
public class UserController {


    @Autowired
    private UserService userservice;

    public UserController(UserService userservice) {
        this.userservice = userservice;
    }

    @PostMapping
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userdto) {

        UserDto userdto1 = userservice.createUser(userdto);
        return new ResponseEntity<>(userdto1, HttpStatus.CREATED);


    }

    @PutMapping("/{userId}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("userId") Integer userId, @Valid @RequestBody UserDto userdto) {
        UserDto updateduser = userservice.updateUser(userdto, userId);

        return new ResponseEntity<>(updateduser, HttpStatus.OK);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<ApiResponseMessage> deleteUser(@PathVariable("userId") Integer userId) {
        userservice.deleteUser(userId);
        ApiResponseMessage messege= ApiResponseMessage.builder().message(" user is deleted successfully").build();
        return new ResponseEntity<>(messege, HttpStatus.OK);

    }
    @GetMapping
    public ResponseEntity<List<UserDto>>  getAllUsers(UserDto userdto){

        return new ResponseEntity<>(userservice.getAllUser(userdto),HttpStatus.OK);

    }
    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUser(@PathVariable Integer UserId){
        return new ResponseEntity<>(userservice.getUserById(UserId),HttpStatus.OK);
    }
    @GetMapping("/email/{email}")
    public ResponseEntity<UserDto>getUserByEmail(@PathVariable String email){
        return new ResponseEntity<>(userservice.getUserByEmail(email),HttpStatus.OK);
    }


    @GetMapping("/search/{keyword}")
    public ResponseEntity<List<UserDto>> searchUser(@PathVariable String keyword){
        return new ResponseEntity<>(userservice.searchUser(keyword),HttpStatus.OK);
    }


}
