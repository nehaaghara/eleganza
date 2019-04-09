/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Controller;

import com.neha.Service.AppointmentService;
import com.neha.Service.EmployeeScheduleService;
import com.neha.model.TblAppointment;
import com.neha.model.TblUser;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author ITMCS
 */
@Controller
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    @Autowired
    EmployeeScheduleService employeeScheduleService;

    @RequestMapping(value = "/addAppointment", method = RequestMethod.GET)
    public String addAppointment(Model model) {
        model.addAttribute("tblAppointment", new TblAppointment());
        model.addAttribute("lstEmployee", employeeScheduleService.showemployeeschedulepageservice());
        return "com.neha.addAppointment";
    }

    @RequestMapping(value = "/viewAppointment", method = RequestMethod.GET)
    public String viewAppointment(Model model) {
        List<TblAppointment> lstAppointments = appointmentService.fetchAllAppointment();
        model.addAttribute("lstAppointments", lstAppointments);
        return "com.neha.viewAppointment";
    }

    @RequestMapping(value = "/saveappointment", method = RequestMethod.POST)
    public String saveAppointment(HttpServletRequest request, @ModelAttribute("tblAppointment") TblAppointment addTblAppointment, RedirectAttributes redirectAttributes) throws ParseException {
        String response = null;
        addTblAppointment.setFlag(1);
        TblUser tblUser = new TblUser();
        TblUser lstuser = (TblUser) request.getSession(false).getAttribute("sessionuser");
        tblUser.setUserid(lstuser.getUserid());
        addTblAppointment.setUserFk(tblUser);
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = formatter.parse(addTblAppointment.getTransientdate());
        addTblAppointment.setDate(dt);
        formatter = new SimpleDateFormat("HH:mm");
        java.sql.Time timeValue = new java.sql.Time(formatter.parse(addTblAppointment.getTransienttime()).getTime());
        addTblAppointment.setTime(timeValue);

        if (addTblAppointment.getAppointmentId() == null) {
            response = appointmentService.saveAppointment(addTblAppointment);
            redirectAttributes.addFlashAttribute("SuccessMessage", response);
        } else {
            response = appointmentService.updateAppointmentById(addTblAppointment);
            redirectAttributes.addFlashAttribute("UpdateMessage", response);
        }
        if (request.getParameter("save") != null) {
            return "redirect:/viewAppointment";
        } else if (request.getParameter("saveAndNew") != null) {
            return "redirect:/addAppointment";
        }
        return "redirect:/viewAppointment";
    }

    @RequestMapping(value = "/editAppointment/{appointmentId}", method = RequestMethod.GET)
    public String editAppointment(Model model, @PathVariable("appointmentId") BigInteger appointmentId) {
        TblAppointment tblAppointment = appointmentService.fetchAppointmentById(appointmentId);
        model.addAttribute("tblAppointment", tblAppointment);
        return "com.neha.addAppointment";
    }

    @RequestMapping(value = "/deleteAppointment/{appointmentId}", method = RequestMethod.GET)
    public String deleteAppointment(@PathVariable("appointmentId") BigInteger appointmentId) {
        appointmentService.deleteAppointmentById(appointmentId);
        return "redirect:/viewAppointment";
    }
}
