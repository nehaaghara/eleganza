/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.ServiceImpl;

import com.neha.Repo.UserProfileRepository;
import com.neha.Service.UserProfileService;
import com.neha.model.TblUser;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS
 */
@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    UserProfileRepository userProfileRepository;

    @Override
    public String updateProfileInformation(TblUser tblUser, HttpServletRequest request) {
        TblUser oldValue = userProfileRepository.fetchById(tblUser.getUserid());
        oldValue.setFirst_name(tblUser.getFirst_name());
        oldValue.setLast_name(tblUser.getLast_name());
        oldValue.setUsername(tblUser.getUsername());
        oldValue.setEmail_address(tblUser.getEmail_address());
        oldValue.setContect(tblUser.getContect());
        userProfileRepository.updateProfileInformation(oldValue);
        return "Profile Updated SuccessFully";
    }

    @Override
    public List<TblUser> fetchAllUser() {
        return userProfileRepository.fetchAllUser();
    }

    @Override
    public String updatePasswordById(TblUser tblUser, HttpServletRequest request) {
        TblUser tblUserOldValue = userProfileRepository.fetchpasswordById(tblUser.getUserid(), request);
        if (tblUserOldValue != null) {
            tblUserOldValue.setPassword(tblUser.getPassword());
            tblUserOldValue.setConformpassword(tblUser.getPassword());
            userProfileRepository.updatePasswordById(tblUserOldValue);
            return "Update Successfully";
        } else {
            System.out.println("in else service");
            return "Enter correct Old Password";
        }

    }

}
