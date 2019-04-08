/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Controller;

import com.neha.Service.AppointmentService;
import com.neha.model.TblAppointment;
import java.math.BigInteger;
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

    @RequestMapping(value = "/addAppointment", method = RequestMethod.GET)
    public String addAppointment(Model model) {
        model.addAttribute("tblAppointment", new TblAppointment());
        return "com.neha.addAppointment";
    }

    @RequestMapping(value = "/viewAppointment", method = RequestMethod.GET)
    public String viewAppointment(Model model) {
        List<TblAppointment> lstAppointments = appointmentService.fetchAllAppointment();
        model.addAttribute("lstAppointments", lstAppointments);
        return "com.neha.viewAppointment";
    }

    @RequestMapping(value = "/saveappointment", method = RequestMethod.GET)
    public String saveAppointment(HttpServletRequest request, @ModelAttribute("tblAppointment") TblAppointment addTblAppointment, RedirectAttributes redirectAttributes) {
        System.out.println("in controller");
        String response = null;
        if (addTblAppointment.getAppointmentId() == null) {
            System.out.println("in if"+addTblAppointment.getDiscount());
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

    @RequestMapping(value = "/deleteproduct/{appointmentId}", method = RequestMethod.GET)
    public String deleteAppointment(@PathVariable("appointmentId") BigInteger appointmentId) {
        appointmentService.deleteAppointmentById(appointmentId);
        return "redirect:/viewAppointment";
    }
}
