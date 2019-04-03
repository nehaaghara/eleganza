/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.ServiceImpl;

import com.neha.Repo.AdminPackageServiceMappingRepo;
import com.neha.Service.AdminPackageServiceMappingService;
import com.neha.model.TblPackageService;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS
 */
@Service
public class AdminPackageServiceMappingServiceImpl implements AdminPackageServiceMappingService {

    @Autowired
    AdminPackageServiceMappingRepo adminPackageServiceMappingRepo;

    @Override
    public void savePackageService(List<TblPackageService> lsTblPackageServices) {
        adminPackageServiceMappingRepo.savePackageSerivce(lsTblPackageServices);
    }

    @Override
    public List<TblPackageService> fetchServiceById(BigInteger packagePk) {
        return adminPackageServiceMappingRepo.fetchById(packagePk);
    }

    @Override
    public void updateBranchById(List<TblPackageService> lsTblPackageServices, BigInteger packagePk) {
        List<TblPackageService> lstPackageServices = adminPackageServiceMappingRepo.fetchById(packagePk);
       // adminPackageServiceMappingRepo.deleteById(lstPackageServices);
        adminPackageServiceMappingRepo.updateById(lsTblPackageServices);
    }

}
