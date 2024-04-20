package com.chandan.bindings;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class User {
    private  String fullName;
    private  String email;
    private  Long mobile;
    private  String gender;
    private LocalDate dob;
    private  Long ssn;
}
