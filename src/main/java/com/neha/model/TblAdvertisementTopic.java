/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ITMCS
 */
@Entity
@Table(name = "tbl_advttopic")
public class TblAdvertisementTopic implements Serializable {

    @Id
    @Column(name = "topic_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    BigInteger topic_Id;

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;

    @Column(name = "flag")
    int flag;

    public BigInteger getTopic_Id() {
        return topic_Id;
    }

    public void setTopic_Id(BigInteger topic_Id) {
        this.topic_Id = topic_Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

}
