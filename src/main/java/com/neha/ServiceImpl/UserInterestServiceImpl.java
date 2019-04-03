/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.ServiceImpl;

import com.neha.Repo.UserInterestRepository;
import com.neha.Service.UserInterestService;
import com.neha.model.TblUserInterest;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS
 */
@Service
public class UserInterestServiceImpl implements UserInterestService {

    @Autowired
    UserInterestRepository userInterestRepository;

    @Override
    public String saveUserInterestTopic(TblUserInterest tblUserInterest) {
        tblUserInterest.setTopic_Id(tblUserInterest.getTopic_Id());
     //   tblUserInterest.setUserId(tblUserInterest.getUserId());
        userInterestRepository.saveUserInterestTopic(tblUserInterest);
        return "Saved Successfully";
    }

    @Override
    public List<TblUserInterest> fetchAllUserInterestTopic() {
        return userInterestRepository.fetchAllUserInterestTopic();
    }

    @Override
    public TblUserInterest fetchUserInterestTopicById(BigInteger interestId) {
        return userInterestRepository.fetchUserInterestTopicById(interestId);
    }

    @Override
    public String deleteUserInterestTopicById(BigInteger interestId) {
        TblUserInterest tblUserInterest = new TblUserInterest();
        tblUserInterest.setInterestId(interestId);
        userInterestRepository.deleteUserInterestTopicById(tblUserInterest);
        return "Delete Successfully";
    }

    @Override
    public String updateUserInterestTopicById(TblUserInterest tblUserInterest) {
        userInterestRepository.updateUserInterestTopicById(tblUserInterest);
        return "Update Successfully";
    }

    @Override
    public List<TblUserInterest> fetchUserInterestById(BigInteger userId) {
        return userInterestRepository.fetchAllUserInterestTopicById(userId);
    }

}
