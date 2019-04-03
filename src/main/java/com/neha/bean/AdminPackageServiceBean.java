/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.bean;

import com.neha.model.TblPackage;
import com.neha.model.TblPackageService;
import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author ITMCS
 */
public class AdminPackageServiceBean {

    TblPackage tblPackage;
    List<BigInteger> services;
    List<TblPackageService> lstTblPackageService;

    public TblPackage getTblPackage() {
        return tblPackage;
    }

    public void setTblPackage(TblPackage tblPackage) {
        this.tblPackage = tblPackage;
    }

    public List<BigInteger> getServices() {
        return services;
    }

    public void setServices(List<BigInteger> services) {
        this.services = services;
    }

    public List<TblPackageService> getLstTblPackageService() {
        return lstTblPackageService;
    }

    public void setLstTblPackageService(List<TblPackageService> lstTblPackageService) {
        this.lstTblPackageService = lstTblPackageService;
    }
    
    

}
