/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.ServiceImpl;

import com.neha.Repo.AuthenticationRepo;
import com.neha.Service.AuthenticationService;
import com.neha.model.TblUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-PC
 */
@Service
public class AuthenticationServiceImpl implements AuthenticationService{

    @Autowired
    AuthenticationRepo authenticationRepo;
    
    @Override
    public void registerservice(TblUser tblUser) {
       authenticationRepo.registerrepo(tblUser);
    }
    
}
