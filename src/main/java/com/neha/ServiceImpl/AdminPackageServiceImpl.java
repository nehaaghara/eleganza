/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.ServiceImpl;

import com.neha.Repo.AdminPackageRepo;
import com.neha.Service.AdminPackageService;
import com.neha.model.TblPackage;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS
 */
@Service
public class AdminPackageServiceImpl implements AdminPackageService {

    @Autowired
    AdminPackageRepo adminPackageRepo;
    
    @Override
    public String saveAdminPackage(TblPackage tblAdminPackage) {
       // tblAdminPackage.setServiceId(tblAdminPackage.getServiceId());
        tblAdminPackage.setPackageName(tblAdminPackage.getPackageName());
        tblAdminPackage.setCreationDate(tblAdminPackage.getCreationDate());
        tblAdminPackage.setExpiryDate(tblAdminPackage.getExpiryDate());
        tblAdminPackage.setDescription(tblAdminPackage.getDescription());
        tblAdminPackage.setCost(tblAdminPackage.getCost());
        tblAdminPackage.setFlag(1);
        adminPackageRepo.saveAdminPackage(tblAdminPackage);
        return "Save Success";
    }

    @Override
    public List<TblPackage> fetchAllAdminPackage() {
        return adminPackageRepo.fetchAllAdminPackage();
    }

    @Override
    public TblPackage fetchAdminPackageById(BigInteger packagePk) {
        return adminPackageRepo.fetchAdminPackageById(packagePk);
    }

    @Override
    public String deleteAdminPackageById(BigInteger packagePk) {
        TblPackage tblPackage = new  TblPackage();
        tblPackage.setPackage_Id(packagePk);
         adminPackageRepo.deleteAdminPackageById(tblPackage);
         return "Delete Success";
    }

    @Override
    public String updateAdminPackageById(TblPackage tblAdminPackage) {
        TblPackage oldValue = adminPackageRepo.fetchAdminPackageById(tblAdminPackage.getPackage_Id());
        oldValue.setPackageName(tblAdminPackage.getPackageName());
        oldValue.setCreationDate(tblAdminPackage.getCreationDate());
        oldValue.setExpiryDate(tblAdminPackage.getExpiryDate());
        oldValue.setDescription(tblAdminPackage.getDescription());
        oldValue.setCost(tblAdminPackage.getCost());
        oldValue.setFlag(1);
        adminPackageRepo.updateAdminPackageById(oldValue);
        return "Update SuccessFully";
    }

}
