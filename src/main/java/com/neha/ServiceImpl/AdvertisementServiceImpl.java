/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.ServiceImpl;

import com.neha.Repo.AdvertisementRepository;
import com.neha.Service.AdvertisementService;
import com.neha.model.TblAdvertisementTopic;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS
 */
@Service
public class AdvertisementServiceImpl implements AdvertisementService {

    @Autowired
    AdvertisementRepository advertisementRepository;

    @Override
    public String saveAdvertismentTopic(TblAdvertisementTopic tblAdvertisementTopic) {
        tblAdvertisementTopic.setTitle(tblAdvertisementTopic.getTitle());
        tblAdvertisementTopic.setDescription(tblAdvertisementTopic.getDescription());
        tblAdvertisementTopic.setFlag(1);
        advertisementRepository.saveAdvertismentTopic(tblAdvertisementTopic);
        return "Saved Successfully";
    }

    @Override
    public List<TblAdvertisementTopic> fetchAllAdvertismentTopic() {
        return advertisementRepository.fetchAllAdvertismentTopic();
    }

    @Override
    public TblAdvertisementTopic fetchAdvertismentTopicById(BigInteger topicId) {
        return advertisementRepository.fetchAdvertismentTopicById(topicId);
    }

    @Override
    public String deleteAdvertismentTopicById(BigInteger topicId) {
        TblAdvertisementTopic tblAdvertisementTopic = new TblAdvertisementTopic();
        tblAdvertisementTopic.setTopic_Id(topicId);
        advertisementRepository.deleteAdvertismentTopicById(tblAdvertisementTopic);
        return "Delete Successfully";
    }

    @Override
    public String updateAdvertismentTopicById(TblAdvertisementTopic tblAdvertisementTopic) {
        TblAdvertisementTopic tbloldAdvertisementTopic1 = advertisementRepository.fetchAdvertismentTopicById(tblAdvertisementTopic.getTopic_Id());
        tbloldAdvertisementTopic1.setTitle(tblAdvertisementTopic.getTitle());
        tbloldAdvertisementTopic1.setDescription(tblAdvertisementTopic.getDescription());
        tbloldAdvertisementTopic1.setFlag(1);
        advertisementRepository.updateAdvertismentTopicById(tbloldAdvertisementTopic1);
        return "Update SuccessFully";
    }

}
