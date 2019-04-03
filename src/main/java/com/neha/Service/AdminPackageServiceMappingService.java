/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Service;

import com.neha.model.TblPackageService;
import java.math.BigInteger;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS
 */
@Service
public interface AdminPackageServiceMappingService {
     public void savePackageService(List<TblPackageService> lsTblPackageServices);

    public List<TblPackageService> fetchServiceById(BigInteger packagePk);

    public void updateBranchById(List<TblPackageService> lsTblPackageServices, BigInteger packagePk);
}
