/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Repo;

import com.neha.model.TblAdminService;
import com.neha.model.TblAdvertisementTopic;
import java.math.BigInteger;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS
 */
@Repository
public interface AdminServiceRepository {

    public TblAdminService saveAdminService(TblAdminService tblAdminService);

    public List<TblAdminService> fetchAllAdminService();
    
    public TblAdminService fetchServiceById(BigInteger servicePk);
    
    public void deleteServiceById(TblAdminService tblAdminService);
    
    public void updateServiceById(TblAdminService tblAdminService);
    
   

}
