/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Repo;

import com.neha.model.TblPackageService;
import java.math.BigInteger;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS
 */
@Repository
public interface AdminPackageServiceMappingRepo {

    public void savePackageSerivce(TblPackageService tblPackageService);

    public void savePackageSerivce(List<TblPackageService> lstTblPackageServices);
    
    public List<TblPackageService> fetchById(BigInteger packageId);
    
    public void updateById(List<TblPackageService> lstTblPackageServices);
    
    public void deleteById(List<TblPackageService> lstTblPackageServices);
}
