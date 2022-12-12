package com.user.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.user.model.UserDetail;
// import com.user.user.model.UserDetail;
import com.user.user.repository.userRepository;

@Service
public class userService {

    @Autowired
    private userRepository userRepo;

    // public List<UserDetail> getAll() {
    //     return userRepo.getAll;
    // }

    public String update(UserDetail user) {
        return userRepo.update(user);
    }

   

    
}
