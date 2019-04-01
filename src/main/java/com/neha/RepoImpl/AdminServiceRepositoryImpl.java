/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.RepoImpl;

import com.neha.Repo.AdminServiceRepository;
import com.neha.dal.CommonDao;
import com.neha.model.TblAdminService;
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
    public TblAdminService saveAdvertismentTopic(TblAdminService tblAdminService) {
        commonDao.save(tblAdminService);
        return tblAdminService;
    }

    @Override
    public List<TblAdminService> fetchAllAdvertismentTopic() {
        return commonDao.findEntity(TblAdminService.class);
    }
    
}
