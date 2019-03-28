/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Service;

import com.neha.model.TblAdvertisementTopic;
import java.math.BigInteger;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS
 */
@Service
public interface AdvertisementService {

    public String saveAdvertismentTopic(TblAdvertisementTopic tblAdvertisementTopic);

    public List<TblAdvertisementTopic> fetchAllAdvertismentTopic();

    public TblAdvertisementTopic fetchAdvertismentTopicById(BigInteger topicId);

    public String deleteAdvertismentTopicById(BigInteger topicId);

    public String updateAdvertismentTopicById(TblAdvertisementTopic tblAdvertisementTopic);
}
