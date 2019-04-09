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
@Table(name = "tbl_payment")
public class TblPayment implements Serializable {

    @Id
    @Column(name = "paymentId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    BigInteger paymentId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userFk")
        TblUser userFk;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "packageFk")
    TblPackage packageFk;
    
    @Column(name = "amount")
    String  amount;

    public BigInteger getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(BigInteger paymentId) {
        this.paymentId = paymentId;
    }

    public TblUser getUserFk() {
        return userFk;
    }

    public void setUserFk(TblUser userFk) {
        this.userFk = userFk;
    }

    public TblPackage getPackageFk() {
        return packageFk;
    }

    public void setPackageFk(TblPackage packageFk) {
        this.packageFk = packageFk;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    

}
