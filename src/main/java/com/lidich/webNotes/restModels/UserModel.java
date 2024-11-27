package com.lidich.webNotes.restModels;

import lombok.Data;

@Data
public class UserModel {
    private String username;
    private String password;
    private String email;
}
