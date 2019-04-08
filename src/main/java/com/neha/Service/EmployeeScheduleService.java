/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Service;

import com.neha.model.TblEmployeeSchedule;
import com.neha.model.TblUser;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-PC
 */
@Service
public interface EmployeeScheduleService {
    public List<TblUser> dataofempschedulepageservice();
    public void storedataofemployeescheduleservice(TblEmployeeSchedule tblEmployeeSchedule) throws ParseException;
    public List<TblEmployeeSchedule> showemployeeschedulepageservice();
    public TblEmployeeSchedule editdataofempschedulebyempidservice(BigInteger empid);
    public void deletedataofempschedulebyidservice(BigInteger empid);
    
}
