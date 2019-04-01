/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.RepoImpl;

import com.neha.Repo.UserProfileRepository;
import com.neha.dal.CommonDao;
import com.neha.dal.OperationTypeEnum;
import com.neha.model.TblUser;
import java.math.BigInteger;
import static java.util.Collections.list;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS
 */
@Repository
public class UserProfileRepositoryImpl implements UserProfileRepository{

    @Autowired
    CommonDao commonDao;
    
    @Override
    public void updateProfileInformation(TblUser tblUser) {
        commonDao.update(tblUser);
        }

    @Override
    public TblUser fetchById(BigInteger userId) {
        List<TblUser> lstUser= commonDao.findEntity(TblUser.class,"userid",OperationTypeEnum.EQ,userId);
        return lstUser.get(0);
    }

    @Override
    public List<TblUser> fetchAllUser() {
        return commonDao.findEntity(TblUser.class,"tblUserRole.rolePK",OperationTypeEnum.EQ,new BigInteger("2"));
    }
    
    
}
