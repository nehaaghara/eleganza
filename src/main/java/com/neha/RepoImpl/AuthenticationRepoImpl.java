/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.RepoImpl;

import com.neha.Repo.AuthenticationRepo;
import com.neha.dal.CommonDao;
import com.neha.dal.OperationTypeEnum;
import com.neha.model.TblUser;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS-PC
 */
@Repository
public class AuthenticationRepoImpl implements AuthenticationRepo {

    @Autowired
    CommonDao commonDAO;

    @Override
    public void registerrepo(TblUser tblUser) {

        commonDAO.save(tblUser);
    }

    @Override
    public List<TblUser> loginrepo(TblUser tblUser) {
        return commonDAO.findEntity(TblUser.class, "email_address", OperationTypeEnum.EQ, tblUser.getEmail_address(), "password", OperationTypeEnum.EQ, tblUser.getPassword());
    }

    @Override
    public List<TblUser> fetchAllUser() {
        return commonDAO.findEntity(TblUser.class,"tblUserRole.rolePK",OperationTypeEnum.EQ,2);
    }

}
