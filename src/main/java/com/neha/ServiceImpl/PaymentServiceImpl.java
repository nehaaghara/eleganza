/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.ServiceImpl;

import com.neha.Repo.PaymentRepo;
import com.neha.Service.PaymentService;
import com.neha.model.TblPayment;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS
 */
@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    PaymentRepo paymentRepo;
    
    @Override
    public String savePayment(TblPayment tblPayment) {
        paymentRepo.savePayment(tblPayment);
        return "Payment SuccessFully";
    }

    @Override
    public List<TblPayment> fetchAllPayment() {
        return paymentRepo.fetchAllPayment();
    }
    
}
