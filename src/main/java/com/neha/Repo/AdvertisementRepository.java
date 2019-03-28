/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Repo;

import com.neha.model.TblAdvertisementTopic;
import java.math.BigInteger;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS
 */
@Repository
public interface AdvertisementRepository {

    public TblAdvertisementTopic saveAdvertismentTopic(TblAdvertisementTopic tblAdvertisementTopic);

    public List<TblAdvertisementTopic> fetchAllAdvertismentTopic();

    public TblAdvertisementTopic fetchAdvertismentTopicById(BigInteger topicId);

    public void deleteAdvertismentTopicById(TblAdvertisementTopic tblAdvertisementTopic);

    public void updateAdvertismentTopicById(TblAdvertisementTopic tblAdvertisementTopic);
}
