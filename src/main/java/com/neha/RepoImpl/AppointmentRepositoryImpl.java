/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.RepoImpl;

import com.neha.Repo.AppointmentRepository;
import com.neha.dal.CommonDao;
import com.neha.dal.OperationTypeEnum;
import com.neha.model.TblAppointment;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS
 */
@Repository
public class AppointmentRepositoryImpl implements AppointmentRepository{

    @Autowired
    CommonDao commonDao;
    
    @Override
    public TblAppointment saveAppointment(TblAppointment tblAppointment) {
        commonDao.save(tblAppointment);
        return tblAppointment;
    }

    @Override
    public List<TblAppointment> fetchAllAppointment() {
        return commonDao.findEntity(TblAppointment.class);
    }

    @Override
    public TblAppointment fetchAppointmentById(BigInteger appointmentId) {
        List<TblAppointment> lstAppointment = commonDao.findEntity(TblAppointment.class,"appointmentId",OperationTypeEnum.EQ,appointmentId);
        return lstAppointment.get(0);
        }

    @Override
    public void deleteAppointmentById(TblAppointment tblAppointment) {
        commonDao.delete(tblAppointment);
    }

    @Override
    public void updateAppointmentById(TblAppointment tblAppointment) {
        commonDao.update(tblAppointment);
    }
    
}
