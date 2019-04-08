/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Repo;

import com.neha.model.TblEmployeeSchedule;
import com.neha.model.TblUser;
import java.math.BigInteger;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-PC
 */
@Service
public interface EmployeeScheduleRepo {
    public List<TblUser> dataofempschedulepagerepo();
    public void storedataofemployeeschedulerepo(TblEmployeeSchedule tblEmployeeSchedule);
    public List<TblEmployeeSchedule>  showemployeeschedulepagerepo();
    public TblEmployeeSchedule  editdataofempschedulebyempidrepo(BigInteger empid);
    public void deletedataofempschedulebyidrepo(BigInteger empid);
    
}
