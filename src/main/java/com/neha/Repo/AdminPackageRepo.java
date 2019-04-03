/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Repo;

import com.neha.model.TblAdminService;
import com.neha.model.TblPackage;
import java.math.BigInteger;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS
 */
@Repository
public interface AdminPackageRepo {

    public TblPackage saveAdminPackage(TblPackage tblAdminPackage);

    public List<TblPackage> fetchAllAdminPackage();

    public TblPackage fetchAdminPackageById(BigInteger packagePk);

    public void deleteAdminPackageById(TblPackage tblAdminPackage);

    public void updateAdminPackageById(TblPackage tblAdminPackage);

}
