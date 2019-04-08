/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.ServiceImpl;

import com.neha.Repo.EmployeeScheduleRepo;
import com.neha.Service.EmployeeScheduleService;
import com.neha.model.TblEmployeeSchedule;
import com.neha.model.TblUser;
import java.math.BigInteger;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-PC
 */
@Service
public class EmployeeScheduleServiceImpl implements EmployeeScheduleService{

    @Autowired
    EmployeeScheduleRepo employeeScheduleRepo;
    
    @Override
    public List<TblUser> dataofempschedulepageservice() {
      return employeeScheduleRepo.dataofempschedulepagerepo();
    }

    @Override
    public void storedataofemployeescheduleservice(TblEmployeeSchedule tblEmployeeSchedule) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = formatter.parse(tblEmployeeSchedule.getTemdate());
        tblEmployeeSchedule.setDate(dt);
        formatter = new SimpleDateFormat("HH:mm");
        java.sql.Time timeValue = new java.sql.Time(formatter.parse(tblEmployeeSchedule.getTemtime()).getTime());
        tblEmployeeSchedule.setTime(timeValue);
        tblEmployeeSchedule.setFlag(true);
        employeeScheduleRepo.storedataofemployeeschedulerepo(tblEmployeeSchedule);
    }

    @Override
    public List<TblEmployeeSchedule> showemployeeschedulepageservice() {
        return employeeScheduleRepo.showemployeeschedulepagerepo();
    }

    @Override
    public TblEmployeeSchedule editdataofempschedulebyempidservice(BigInteger empid) {
       
        return employeeScheduleRepo.editdataofempschedulebyempidrepo(empid);
    }

    @Override
    public void deletedataofempschedulebyidservice(BigInteger empid) {
        employeeScheduleRepo.deletedataofempschedulebyidrepo(empid);
    }
    
}
