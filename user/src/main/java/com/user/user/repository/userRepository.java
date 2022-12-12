package com.user.user.repository;

import java.util.List;

// import java.util.List;

// import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.user.user.model.UserDetail;

public interface userRepository extends MongoRepository <UserDetail,String> {

    List<UserDetail> userDetail = null;
    // List<UserDetail> UserDetail = null;
    List<UserDetail> getAll = userDetail;

    default String update(UserDetail user){
        userDetail.stream().filter(e -> e.getEmail()== user.getEmail()).forEach(e ->{
            e.setAccountNonLocked(user.getAccountNonLocked());
        });
        return "successfully";
        
    }; 
}
