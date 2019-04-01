/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.ServiceImpl;

import com.neha.Repo.AdminServiceRepository;
import com.neha.Service.AdminServiceService;
import com.neha.model.TblAdminService;
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
    public String saveAdvertismentTopic(TblAdminService tblAdminService) {
        tblAdminService.setServiceName(tblAdminService.getServiceName());
        tblAdminService.setDescription(tblAdminService.getDescription());
        tblAdminService.setCharges(tblAdminService.getCharges());
        adminServiceRepository.saveAdvertismentTopic(tblAdminService);
        return "Save Success";
    }

    @Override
    public List<TblAdminService> fetchAllAdvertismentTopic() {
        return adminServiceRepository.fetchAllAdvertismentTopic();
    }
    
}
