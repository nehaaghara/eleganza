/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Service;

import com.neha.model.TblUserInterest;
import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author ITMCS
 */
public interface UserInterestService {

    public String saveUserInterestTopic(TblUserInterest tblUserInterest);

    public List<TblUserInterest> fetchAllUserInterestTopic();
    
    public List<TblUserInterest> fetchUserInterestById(BigInteger userId);

    public TblUserInterest fetchUserInterestTopicById(BigInteger interestId);

    public String deleteUserInterestTopicById(BigInteger interestId);

    public String updateUserInterestTopicById(TblUserInterest tblUserInterest);
}
