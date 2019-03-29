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
 * @author ITMCS-PC
 */
@Entity
@Table(name = "tbl_user")
public class TblUser {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid", nullable = false)
    BigInteger userid;
    
    @Column(name = "first_name")
    String first_name;
    
    @Column(name = "last_name")
    String last_name;
    
    @Column(name = "email_address")
    String email_address;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "roleFk")
    TblUserRole tblUserRole;
    
    @Column(name = "gender")
    String gender;
    
    @Column(name = "address")
    String address;
    
    @Column(name = "state")
    String state;
      
    @Column(name = "pincode")
    int pincode;
    
    @Column(name = "city")
    String city;
    
    @Column(name = "contect")
    int contect;
    
    @Column(name = "userName")
    String username;
    
    @Column(name = "password")
    String password;
     
    @Column(name = "conformpassword")
    String conformpassword;
      
    @Column(name = "flag")
    boolean flag;

    public BigInteger getUserid() {
        return userid;
    }

    public void setUserid(BigInteger userid) {
        this.userid = userid;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public TblUserRole getTblUserRole() {
        return tblUserRole;
    }

    public void setTblUserRole(TblUserRole tblUserRole) {
        this.tblUserRole = tblUserRole;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getContect() {
        return contect;
    }

    public void setContect(int contect) {
        this.contect = contect;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConformpassword() {
        return conformpassword;
    }

    public void setConformpassword(String conformpassword) {
        this.conformpassword = conformpassword;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
    
    
}
