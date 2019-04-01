/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author ITMCS-PC
 */
@Entity
@Table(name = "tbl_promation_campaining")
public class TblPromationCampaining implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PromotionId", nullable = false)
    BigInteger promotionid;
     
    @Column(name = "Description")
    String description;
    
    @Column(name = "Flag")
    boolean flag;
    
    @Column(name = "Title")
    String title;
    
    @Column(name = "Date")
    Date promotionDate;        
      
    @Transient
    String date;
    
    @Column(name = "Time")
    Time promotionTime;        
     
    @Transient
    String time;

    public Date getPromotionDate() {
        return promotionDate;
    }

    public void setPromotionDate(Date promotionDate) {
        this.promotionDate = promotionDate;
    }

    public Time getPromotionTime() {
        return promotionTime;
    }

    public void setPromotionTime(Time promotionTime) {
        this.promotionTime = promotionTime;
    }

    public BigInteger getPromotionid() {
        return promotionid;
    }

    public void setPromotionid(BigInteger promotionid) {
        this.promotionid = promotionid;
    }
    
    


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
 public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

  

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

  
    
    
    
}
