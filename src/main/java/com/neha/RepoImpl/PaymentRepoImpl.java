/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.RepoImpl;

import com.neha.Repo.PaymentRepo;
import com.neha.dal.CommonDao;
import com.neha.model.TblPayment;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS
 */
@Repository
public class PaymentRepoImpl implements PaymentRepo{

    @Autowired
    CommonDao commonDao;
    
    @Override
    public void savePayment(TblPayment tblPayment) {
       commonDao.saveOrUpdate(tblPayment);
    }

    @Override
    public List<TblPayment> fetchAllPayment() {
        return commonDao.findEntity(TblPayment.class);
    }
   
}
