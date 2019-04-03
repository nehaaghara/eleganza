/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Service;

import com.neha.model.TblAdminService;
import com.neha.model.TblAdvertisementTopic;
import java.math.BigInteger;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS
 */
@Service
public interface AdminServiceService {

    public String saveAdminService(TblAdminService tblAdminService);

    public List<TblAdminService> fetchAllAdminService();
    
    public TblAdminService fetchAdminServiceById(BigInteger servicePk);
    
    public String deleteAdminServiceById(BigInteger servicePk);
    
    public String updateAdminServiceById(TblAdminService tblAdminService);

}
