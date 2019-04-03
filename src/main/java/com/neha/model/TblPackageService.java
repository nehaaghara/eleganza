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
@Table(name = "tbl_packageservice")
public class TblPackageService {

    @Id
    @Column(name = "packageServiceId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    BigInteger packageServiceId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "serviceFk")
    TblAdminService serviceFk;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "packageFk")
    TblPackage packageFk;

    @Column(name = "flag")
    int flag;

    public BigInteger getPackageServiceId() {
        return packageServiceId;
    }

    public void setPackageServiceId(BigInteger packageServiceId) {
        this.packageServiceId = packageServiceId;
    }

    public TblAdminService getServiceFk() {
        return serviceFk;
    }

    public void setServiceFk(TblAdminService serviceFk) {
        this.serviceFk = serviceFk;
    }

    public TblPackage getPackageFk() {
        return packageFk;
    }

    public void setPackageFk(TblPackage packageFk) {
        this.packageFk = packageFk;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    
}
