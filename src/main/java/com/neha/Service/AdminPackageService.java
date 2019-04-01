/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Service;

import com.neha.model.TblAdminService;
import com.neha.model.TblPackage;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS
 */
@Service
public interface AdminPackageService {
    
    public String saveAdvertismentTopic(TblPackage tblAdminPackage);

    public List<TblPackage> fetchAllAdvertismentTopic();

}
