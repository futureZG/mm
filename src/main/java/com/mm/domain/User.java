package com.mm.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String username;
    private String password;
    private Boolean gender;
    private Integer age;
}
