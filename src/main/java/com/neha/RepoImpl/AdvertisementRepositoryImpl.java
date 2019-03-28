/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.RepoImpl;

import com.neha.Repo.AdvertisementRepository;
import com.neha.dal.CommonDAO;
import com.neha.dal.OperationTypeEnum;
import com.neha.model.TblAdvertisementTopic;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS
 */
@Repository
public class AdvertisementRepositoryImpl implements AdvertisementRepository{

    @Autowired
    CommonDAO commonDAO;
    
    @Override
    public TblAdvertisementTopic saveAdvertismentTopic(TblAdvertisementTopic tblAdvertisementTopic) {
        commonDAO.saveOrUpdate(tblAdvertisementTopic);
        return tblAdvertisementTopic;
    }

    @Override
    public List<TblAdvertisementTopic> fetchAllAdvertismentTopic() {
        return commonDAO.findEntity(TblAdvertisementTopic.class);
    }

    @Override
    public TblAdvertisementTopic fetchAdvertismentTopicById(BigInteger topicId) {
        List<TblAdvertisementTopic> lstAdvertisementTopics = commonDAO.findEntity(TblAdvertisementTopic.class,"topic_Id",OperationTypeEnum.EQ,topicId);
        return lstAdvertisementTopics.get(0);
    }

    @Override
    public void deleteAdvertismentTopicById(TblAdvertisementTopic tblAdvertisementTopic) {
       commonDAO.delete(tblAdvertisementTopic);
    }

    @Override
    public void updateAdvertismentTopicById(TblAdvertisementTopic tblAdvertisementTopic) {
       commonDAO.update(tblAdvertisementTopic);
    }
    
}
