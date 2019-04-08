/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.RepoImpl;

import com.neha.Repo.EmployeeScheduleRepo;
import com.neha.dal.CommonDao;
import com.neha.dal.OperationTypeEnum;
import com.neha.model.TblEmployeeSchedule;
import com.neha.model.TblUser;
import com.neha.model.TblUserRole;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS-PC
 */
@Repository
public class EmployeeScheduleRepoImpl implements EmployeeScheduleRepo{

    @Autowired
    CommonDao commonDao;
    
    @Override
    public List<TblUser> dataofempschedulepagerepo() {
      return  commonDao.findEntity(TblUser.class);
    }

    @Override
    public void storedataofemployeeschedulerepo(TblEmployeeSchedule tblEmployeeSchedule) {
      
        if(tblEmployeeSchedule.getEmpid() != null)
        {
         commonDao.saveOrUpdate(tblEmployeeSchedule);
        }
        else
        {
        System.out.println("repo");
        List<TblUser> user= commonDao.findEntity(TblUser.class,"userid",OperationTypeEnum.EQ,tblEmployeeSchedule.getTblUser().getUserid());
        System.out.println("user:"+user.size());
        TblUserRole userrole=new TblUserRole();
        userrole.setRolePK(new BigInteger("3"));
        user.get(0).setTblUserRole(userrole);
        commonDao.saveOrUpdate(user.get(0));
        commonDao.save(tblEmployeeSchedule);    
        }
       
    }

    @Override
    public List<TblEmployeeSchedule> showemployeeschedulepagerepo() {
        return commonDao.findEntity(TblEmployeeSchedule.class);
    }

    @Override
    public TblEmployeeSchedule editdataofempschedulebyempidrepo(BigInteger empid) {
      List<TblEmployeeSchedule> lstTblEmployeeSchedule= commonDao.findEntity(TblEmployeeSchedule.class,"empid",OperationTypeEnum.EQ,empid);
      return lstTblEmployeeSchedule.get(0);
    }

    @Override
    public void deletedataofempschedulebyidrepo(BigInteger empid) {
     List<TblEmployeeSchedule> lstTblEmployeeSchedule=    commonDao.findEntity(TblEmployeeSchedule.class,"empid",OperationTypeEnum.EQ,empid);
     commonDao.delete(lstTblEmployeeSchedule.get(0));
    
    }
    
}
