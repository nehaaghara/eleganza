/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.ServiceImpl;

import com.neha.Repo.AdminPackageRepo;
import com.neha.Service.AdminPackageService;
import com.neha.model.TblPackage;
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
    public String saveAdvertismentTopic(TblPackage tblAdminPackage) {
        tblAdminPackage.setServiceId(tblAdminPackage.getServiceId());
        tblAdminPackage.setCreationDate(tblAdminPackage.getCreationDate());
        tblAdminPackage.setExpiryDate(tblAdminPackage.getExpiryDate());
        tblAdminPackage.setDescription(tblAdminPackage.getDescription());
        tblAdminPackage.setCost(tblAdminPackage.getCost());
        tblAdminPackage.setFlag(1);
        adminPackageRepo.saveAdvertismentTopic(tblAdminPackage);
        return "Save";
    }

    @Override
    public List<TblPackage> fetchAllAdvertismentTopic() {
        return adminPackageRepo.fetchAllAdvertismentTopic();
    }

}
