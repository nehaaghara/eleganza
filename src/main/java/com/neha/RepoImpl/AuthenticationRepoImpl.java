/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.RepoImpl;

import com.neha.Repo.AuthenticationRepo;
import com.neha.dal.CommonDao;
import com.neha.model.TblUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS-PC
 */
@Repository
public class AuthenticationRepoImpl implements AuthenticationRepo{

    @Autowired
    CommonDao commonDAO;
    
    @Override
    public void registerrepo(TblUser tblUser) {
        
        commonDAO.save(tblUser);
    }
    
}
