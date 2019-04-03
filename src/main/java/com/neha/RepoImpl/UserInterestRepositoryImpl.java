/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.RepoImpl;

import com.neha.Repo.UserInterestRepository;
import com.neha.dal.CommonDao;
import com.neha.dal.OperationTypeEnum;
import com.neha.model.TblUserInterest;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS
 */
@Repository
public class UserInterestRepositoryImpl implements UserInterestRepository{

    @Autowired
    CommonDao commonDao;
    
    @Override
    public TblUserInterest saveUserInterestTopic(TblUserInterest tblUserInterest) {
        commonDao.save(tblUserInterest);
        return tblUserInterest;
    }

    @Override
    public List<TblUserInterest> fetchAllUserInterestTopic() {
        return commonDao.findEntity(TblUserInterest.class);
    }

    @Override
    public TblUserInterest fetchUserInterestTopicById(BigInteger interestId) {
        List<TblUserInterest> lstTblUserInterests = commonDao.findEntity(TblUserInterest.class,"interestId",OperationTypeEnum.EQ,interestId);
        return lstTblUserInterests.get(0);
    }

    @Override
    public void deleteUserInterestTopicById(TblUserInterest tblUserInterest) {
        tblUserInterest.setInterestId(tblUserInterest.getInterestId());
        commonDao.delete(tblUserInterest);
    }

    @Override
    public void updateUserInterestTopicById(TblUserInterest tblUserInterest) {
        commonDao.update(tblUserInterest);
    }

    @Override
    public List<TblUserInterest> fetchAllUserInterestTopicById(BigInteger userId) {
        return commonDao.findEntity(TblUserInterest.class,"userId.userid",OperationTypeEnum.EQ,userId);
    }
    
}
