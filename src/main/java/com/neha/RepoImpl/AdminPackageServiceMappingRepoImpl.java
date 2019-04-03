/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.RepoImpl;

import com.neha.Repo.AdminPackageServiceMappingRepo;
import com.neha.dal.CommonDao;
import com.neha.dal.OperationTypeEnum;
import com.neha.model.TblPackageService;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS
 */
@Repository
public class AdminPackageServiceMappingRepoImpl implements AdminPackageServiceMappingRepo {

    @Autowired
    CommonDao commonDao;

    @Override
    public void savePackageSerivce(TblPackageService tblPackageService) {
        commonDao.save(tblPackageService);

    }

    @Override
    public void savePackageSerivce(List<TblPackageService> lstTblPackageServices) {
        commonDao.saveOrUpdateAll(lstTblPackageServices);
    }

    @Override
    public List<TblPackageService> fetchById(BigInteger packageId) {
        List<TblPackageService> lsPackageServices = commonDao.findEntity(TblPackageService.class, "packageFk.package_Id", OperationTypeEnum.EQ, packageId);
        return lsPackageServices;
    }

    @Override
    public void updateById(List<TblPackageService> lstTblPackageServices) {
         commonDao.saveOrUpdateAll(lstTblPackageServices);
    }

    @Override
    public void deleteById(List<TblPackageService> lstTblPackageServices) {
        commonDao.deleteALL(lstTblPackageServices);
    }

}
