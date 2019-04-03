/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.ServiceImpl;

import com.neha.Repo.AdminServiceRepository;
import com.neha.Service.AdminServiceService;
import com.neha.model.TblAdminService;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS
 */
@Service
public class AdminServiceServiceImpl implements AdminServiceService{

    @Autowired
    AdminServiceRepository adminServiceRepository;
    
    @Override
    public String saveAdminService(TblAdminService tblAdminService) {
        tblAdminService.setServiceName(tblAdminService.getServiceName());
        tblAdminService.setDescription(tblAdminService.getDescription());
        tblAdminService.setCharges(tblAdminService.getCharges());
        adminServiceRepository.saveAdminService(tblAdminService);
        return "Save Success";
    }

    @Override
    public List<TblAdminService> fetchAllAdminService() {
        return adminServiceRepository.fetchAllAdminService();
    }

    @Override
    public TblAdminService fetchAdminServiceById(BigInteger servicePk) {
       return  adminServiceRepository.fetchServiceById(servicePk);
    }

    @Override
    public String deleteAdminServiceById(BigInteger servicePk) {
        TblAdminService tblAdminService = new TblAdminService();
        tblAdminService.setService_Id(servicePk);
        adminServiceRepository.deleteServiceById(tblAdminService);
        return "Delete Success";
    }

    @Override
    public String updateAdminServiceById(TblAdminService tblAdminService) {
        TblAdminService oldValue= adminServiceRepository.fetchServiceById(tblAdminService.getService_Id());
        oldValue.setServiceName(tblAdminService.getServiceName());
        oldValue.setDescription(tblAdminService.getDescription());
        oldValue.setCharges(tblAdminService.getCharges());
        oldValue.setFlag(1);
        adminServiceRepository.updateServiceById(tblAdminService);
        return "Update SuccessFully";
    }
    
}
