/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.model;

import java.math.BigInteger;
import java.sql.Time;
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
import javax.persistence.Transient;

/**
 *
 * @author ITMCS-PC
 */
@Entity
@Table(name = "tbl_empyolee_schedule")
public class TblEmployeeSchedule {
    
    @Id
    @Column(name = "EmpId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    BigInteger empid;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "UserId")
    TblUser tblUser;
    
    @Column(name = "Date")
    Date date;
    
    @Column(name = "Time")
    Time time;

    @Column(name = "Flag")
    boolean flag;
    
    @Transient
    String temdate;
    
    @Transient
    String temtime;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getTemdate() {
        return temdate;
    }

    public void setTemdate(String temdate) {
        this.temdate = temdate;
    }

    public String getTemtime() {
        return temtime;
    }

    public void setTemtime(String temtime) {
        this.temtime = temtime;
    }

   

    public BigInteger getEmpid() {
        return empid;
    }

    public void setEmpid(BigInteger empid) {
        this.empid = empid;
    }

    public TblUser getTblUser() {
        return tblUser;
    }

    public void setTblUser(TblUser tblUser) {
        this.tblUser = tblUser;
    }

  
  

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
    

    
    
}
