/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Service;

import com.neha.model.TblUser;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-PC
 */
@Service
public interface AuthenticationService {
    
    public void registerservice( TblUser tblUser);
     public List<TblUser> loginservice(TblUser tblUser);
     public List<TblUser> fetchAllUser();
     public String forgotpasswordprocessservice(String email,String password,String conformpassword);
}
