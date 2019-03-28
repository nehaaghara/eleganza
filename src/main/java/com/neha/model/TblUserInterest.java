/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.model;

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ITMCS
 */
@Entity
@Table(name = "tbl_userinterest")
public class TblUserInterest {

    @Id
    @Column(name = "interestId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    BigInteger interestId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "topic_Id")
    TblAdvertisementTopic topic_Id;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    TblUser userId;

    public BigInteger getInterestId() {
        return interestId;
    }

    public void setInterestId(BigInteger interestId) {
        this.interestId = interestId;
    }

    public TblAdvertisementTopic getTopic_Id() {
        return topic_Id;
    }

    public void setTopic_Id(TblAdvertisementTopic topic_Id) {
        this.topic_Id = topic_Id;
    }

    public TblUser getUserId() {
        return userId;
    }

    public void setUserId(TblUser userId) {
        this.userId = userId;
    }
    
    

}
