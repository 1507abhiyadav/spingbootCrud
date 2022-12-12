package com.user.user.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
// @ToString
@Document(collection = "users")
public class UserDetail {

    private String email;
    private String id;
    private Boolean accountNonLocked;
    private long lockedAt;
    private long loginAttempts;
    
}
