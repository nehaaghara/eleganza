/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.model;

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
    @Table(name = "tbl_adminservice")
public class TblAdminService {

    @Id
    @Column(name = "Service_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    BigInteger service_Id;

    @Column(name = "ServiceName")
    String serviceName;

    @Column(name = "Description")
    String description;

    @Column(name = "Charges")
    String charges;

    @Column(name = "Flag")
    int flag;

    public BigInteger getService_Id() {
        return service_Id;
    }

    public void setService_Id(BigInteger service_Id) {
        this.service_Id = service_Id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
    
    
}
