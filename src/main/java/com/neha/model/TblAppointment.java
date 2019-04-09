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
 * @author ITMCS
 */
@Entity
@Table(name = "tbl_appointment")
public class TblAppointment {

    @Id
    @Column(name = "appointmentId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    BigInteger appointmentId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userFk")
    TblUser userFk;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "empFk")
    TblEmployeeSchedule empFk;

    @Column(name = "date")
    Date date;

    @Transient
    String transientdate;

    @Column(name = "time")
    Time time;

    @Transient
    String transienttime;

    @Column(name = "flag")
    int flag;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public BigInteger getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(BigInteger appointmentId) {
        this.appointmentId = appointmentId;
    }

    public TblUser getUserFk() {
        return userFk;
    }

    public void setUserFk(TblUser userFk) {
        this.userFk = userFk;
    }

    public TblEmployeeSchedule getEmpFk() {
        return empFk;
    }

    public void setEmpFk(TblEmployeeSchedule empFk) {
        this.empFk = empFk;
    }
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

    public String getTransientdate() {
        return transientdate;
    }

    public void setTransientdate(String transientdate) {
        this.transientdate = transientdate;
    }

    public String getTransienttime() {
        return transienttime;
    }

    public void setTransienttime(String transienttime) {
        this.transienttime = transienttime;
    }

}
