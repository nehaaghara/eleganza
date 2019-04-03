/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Repo;


import com.neha.model.TblUserInterest;
import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author ITMCS
 */
public interface UserInterestRepository {
    
    public TblUserInterest saveUserInterestTopic(TblUserInterest tblUserInterest);

    public List<TblUserInterest> fetchAllUserInterestTopic();
    
    public List<TblUserInterest> fetchAllUserInterestTopicById(BigInteger userId);

    public TblUserInterest fetchUserInterestTopicById(BigInteger interestId);

    public void deleteUserInterestTopicById(TblUserInterest tblUserInterest);

    public void updateUserInterestTopicById(TblUserInterest tblUserInterest);
}
