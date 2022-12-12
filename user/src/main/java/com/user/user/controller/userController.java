package com.user.user.controller;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.user.model.UserDetail;

import com.user.user.repository.userRepository;

// import com.user.user.repository.userRepository;
import com.user.user.service.userService;

@RestController
public class userController {


    @Autowired
    private userService uService;

    // @Autowired
    // private userRepository userRepo;

    // @GetMapping("/data")
    // public List<UserDetail>getAll(){
    //     List<UserDetail> allData = uService.getAll();
    //     return allData;

    // }

    // @GetMapping("/data/{Email}")
    // public Optional<UserDetail> getData(@PathVariable String email)
    // {
    //     return userRepo.findById(email);
    // }

    // @PutMapping("/update/{id}")
    // public ResponseEntity<UserDetail> updateData(@RequestBody UserDetail userDetail ,@PathVariable String id)
    //                               {
    //                                 UserDetail user= userRepo.getById(id);
    //                                 user.setAccountNonLocked(userDetail.getAccountNonLocked());
    //                                 user.setLockedAt(userDetail.getLockedAt());
    //                                 user.setLoginAttempts(userDetail.getLoginAttempts());

    //                                 UserDetail updateEmp= userRepo.save(user);

    //                                 return ResponseEntity.ok().body(updateEmp);
    //  
    

    @PutMapping("/update")
    public String update(@RequestBody UserDetail user){
        return uService.update(user);

    }



    

                            }                              

