/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.RepoImpl;

import com.neha.Repo.AdminServiceRepository;
import com.neha.dal.CommonDao;
import com.neha.dal.OperationTypeEnum;
import com.neha.model.TblAdminService;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS
 */
@Repository
public class AdminServiceRepositoryImpl implements AdminServiceRepository{

    @Autowired
    CommonDao commonDao;
    
    @Override
    public TblAdminService saveAdminService(TblAdminService tblAdminService) {
        commonDao.save(tblAdminService);
        return tblAdminService;
    }

    @Override
    public List<TblAdminService> fetchAllAdminService() {
        return commonDao.findEntity(TblAdminService.class);
    }

    @Override
    public TblAdminService fetchServiceById(BigInteger servicePk) {
        List<TblAdminService> lsAdminServices = commonDao.findEntity(TblAdminService.class,"service_Id",OperationTypeEnum.EQ,servicePk);
        return lsAdminServices.get(0);
        }

    @Override
    public void deleteServiceById(TblAdminService tblAdminService) {
        commonDao.delete(tblAdminService);
    }

    @Override
    public void updateServiceById(TblAdminService tblAdminService) {
        commonDao.saveOrUpdate(tblAdminService);
    }
    
}
