/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.RepoImpl;

import com.neha.Repo.AdminPackageRepo;
import com.neha.dal.CommonDao;
import com.neha.model.TblPackage;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS
 */
@Repository
public class AdminPackageRepoImpl implements AdminPackageRepo{

    @Autowired
    CommonDao commonDao;
    
    @Override
    public TblPackage saveAdvertismentTopic(TblPackage tblAdminPackage) {
        commonDao.save(tblAdminPackage);
        return tblAdminPackage;
    }

    @Override
    public List<TblPackage> fetchAllAdvertismentTopic() {
        return commonDao.findEntity(TblPackage.class);
    }
    
}
