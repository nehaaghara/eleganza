/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.model;

import java.math.BigInteger;
import java.util.Date;
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
@Table(name = "tbl_package")
public class TblPackage {

    @Id
    @Column(name = "Package_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    BigInteger package_Id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "serviceId")
    TblAdminService serviceId;

    @Column(name = "CreationDate")
    String creationDate;

    @Column(name = "ExpiryDate")
    String expiryDate;

    @Column(name = "Description")
    String description;

    @Column(name = "Cost")
        String cost;

    @Column(name = "Flag")
    int flag;

    public BigInteger getPackage_Id() {
        return package_Id;
    }

    public void setPackage_Id(BigInteger package_Id) {
        this.package_Id = package_Id;
    }

    public TblAdminService getServiceId() {
        return serviceId;
    }

    public void setServiceId(TblAdminService serviceId) {
        this.serviceId = serviceId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

   
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

}
