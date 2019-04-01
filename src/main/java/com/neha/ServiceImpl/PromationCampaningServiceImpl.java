/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.ServiceImpl;

import com.neha.Repo.PromationCampaningRepo;
import com.neha.Service.PromationCampaningService;
import com.neha.model.TblPromationCampaining;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-PC
 */
@Service
public class PromationCampaningServiceImpl implements PromationCampaningService {
    
    @Autowired
    PromationCampaningRepo promationCampaningRepo;
    
    @Override
    public void promationdatasaveservice(TblPromationCampaining tblPromationCampaining) {
        promationCampaningRepo.promationdatasaverepo(tblPromationCampaining);
    }
    
    @Override
    public List<TblPromationCampaining> viewpageofpromotionservice() {
        System.out.println("in service");
        return promationCampaningRepo.viewpageofpromotionrepo();
    }
    
    @Override
    public TblPromationCampaining editpromotioncampainingservice(BigInteger promotionid) {
        return promationCampaningRepo.editpromotioncampainingrepo(promotionid);        
    }
    
    @Override
    public void deletepromotioncampainingservice(BigInteger promotionid) {
        
        promationCampaningRepo.deletepromotioncampainingrepo(promotionid);
    }
    
}
