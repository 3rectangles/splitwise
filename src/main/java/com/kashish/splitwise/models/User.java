package com.kashish.splitwise.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends BaseModel {
    private String name;
    private int phone;
    private String password;
    // is the user invited or not
    private UserStatus userStatus;




}
