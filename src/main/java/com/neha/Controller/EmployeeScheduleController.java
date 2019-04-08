/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Controller;

import com.neha.Service.EmployeeScheduleService;
import com.neha.model.TblEmployeeSchedule;
import com.neha.model.TblUser;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ITMCS-PC
 */
@Controller
public class EmployeeScheduleController {
    
    ModelAndView mv=new ModelAndView();
    
    @Autowired
    EmployeeScheduleService employeeScheduleService;
    
    @RequestMapping("/employeeschedulepage")
    public ModelAndView employeeschedule(HttpServletRequest req)
    {
      
        List<TblUser> alluser=employeeScheduleService.dataofempschedulepageservice();
        mv.addObject("alluser", alluser);
        mv.addObject("emplyoeeSchedule",new TblEmployeeSchedule());
        mv.setViewName("com.neha.employeescheduletiles");
        return mv;
    }
    
    @RequestMapping(value = "/savedataofemployeeschedule",method = RequestMethod.GET)
    public ModelAndView storedataofemployeeschedule(@ModelAttribute("emplyoeeSchedule") TblEmployeeSchedule tblEmployeeSchedule ,HttpServletRequest req)throws ParseException
    {
       System.out.println("controller");
       employeeScheduleService.storedataofemployeescheduleservice(tblEmployeeSchedule);
       if(req.getParameter("saveAndNew") != null)
       {
           System.out.println("date"+tblEmployeeSchedule.getTemdate()+"time"+tblEmployeeSchedule.getTemtime());
           mv.setViewName("redirect:/employeeschedulepage");
       }
       else if(req.getParameter("save") != null)
       {
           mv.setViewName("redirect:/viewemployeeschedulepage");
       }
       else
       {
          mv.setViewName("redirect:/viewemployeeschedulepage");
       }
       return mv; 
    }
    
    @RequestMapping(value = "/viewemployeeschedulepage",method = RequestMethod.GET)
    public ModelAndView showemployeeschedulepage()
    {
        List<TblEmployeeSchedule> alldataoftblemployeeschedule=employeeScheduleService.showemployeeschedulepageservice();
        mv.addObject("alldataoftblemployeeschedule", alldataoftblemployeeschedule);
        mv.setViewName("com.neha.viewemployeescheduletiles");
        return mv;
    }
    
    @RequestMapping(value = "/editemployeeschedule/{empid}",method = RequestMethod.GET)
    public ModelAndView editdataofempschedulebyempid(@PathVariable("empid") BigInteger empid)
    {
        TblEmployeeSchedule tblEmployeeSchedule=employeeScheduleService.editdataofempschedulebyempidservice(empid);
        List<TblUser> alluser=employeeScheduleService.dataofempschedulepageservice();
        mv.addObject("alluser", alluser);
        mv.addObject("emplyoeeSchedule", tblEmployeeSchedule);
        mv.setViewName("com.neha.employeescheduletiles");
        return mv;
    }
    
   @RequestMapping(value = "/deleteemployeeschedule/{empid}",method = RequestMethod.GET)
   public ModelAndView deletedataofempschedulebyid(@PathVariable("empid") BigInteger empid)
   {
       employeeScheduleService.deletedataofempschedulebyidservice(empid);
       mv.setViewName("redirect:/viewemployeeschedulepage");
       return mv;
   }
    
}
