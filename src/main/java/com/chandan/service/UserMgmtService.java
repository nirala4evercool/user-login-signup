package com.chandan.service;

import com.chandan.bindings.ActivateAccount;
import com.chandan.bindings.Login;
import com.chandan.bindings.User;

import java.util.List;

public interface UserMgmtService {
    public boolean saveUser(User user);
    public  boolean activateUserAcc(ActivateAccount activateAccount);
    public List<User> getAllUsers();
    public  User getUserById(Integer userId);
    public  boolean deleteUserById(Integer userId);
    public  boolean changeAccountStatus(Integer userId,String accStatus);
    public  String login(Login login);
    public  String forgotPwd(String email);


}
