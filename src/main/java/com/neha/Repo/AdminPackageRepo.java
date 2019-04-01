/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Repo;

import com.neha.model.TblAdminService;
import com.neha.model.TblPackage;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS
 */
@Repository
public interface AdminPackageRepo {
     public TblPackage saveAdvertismentTopic(TblPackage tblAdminPackage);

    public List<TblPackage> fetchAllAdvertismentTopic();

}
