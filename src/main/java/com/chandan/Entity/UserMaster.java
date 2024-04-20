package com.chandan.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="USER_MASTER")
@Getter
@Setter
public class UserMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;
    private String fullName;
    private Long mobile;
    private String email;
    private String gender;
    private LocalDate dob;
    private Long ssn;
    private String password;
    private String accStatus;
    private LocalDate createdDate;
    private LocalDate updatedDate;
    private String createdBy;
    private String updatedBy;
}
