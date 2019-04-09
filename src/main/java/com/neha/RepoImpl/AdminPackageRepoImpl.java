/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.RepoImpl;

import com.neha.Repo.AdminPackageRepo;
import com.neha.dal.CommonDao;
import com.neha.dal.OperationTypeEnum;
import com.neha.model.TblPackage;
import java.math.BigInteger;
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
    public TblPackage saveAdminPackage(TblPackage tblAdminPackage) {
        commonDao.save(tblAdminPackage);
        return tblAdminPackage;
    }

    @Override
    public List<TblPackage> fetchAllAdminPackage() {
        return commonDao.findEntity(TblPackage.class);
    }

    @Override
    public TblPackage fetchAdminPackageById(BigInteger packagePk) {
        List<TblPackage> lsPackages = commonDao.findEntity(TblPackage.class,"package_Id",OperationTypeEnum.EQ,packagePk);
        return lsPackages.get(0);
    }

    @Override
    public void deleteAdminPackageById(TblPackage tblAdminPackage) {
        commonDao.delete(tblAdminPackage);
    }

    @Override
    public void updateAdminPackageById(TblPackage tblAdminPackage) {
        commonDao.update(tblAdminPackage);
    }

   
    
}
