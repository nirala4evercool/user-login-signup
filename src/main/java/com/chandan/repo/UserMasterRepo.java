package com.chandan.repo;

import com.chandan.Entity.UserMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMasterRepo  extends JpaRepository<UserMaster,Integer> {
    public UserMaster findByEmailAndPassword(String email,String pwd);
    public UserMaster findByEmail(String email);
}
