/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Controller;

import com.neha.Service.AdminServiceService;
import com.neha.model.TblAdminService;
import com.neha.model.TblAdvertisementTopic;
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
public class AdminServiceController {

    @Autowired
    AdminServiceService adminServiceService;

    @RequestMapping(value = "/addAdminService", method = RequestMethod.GET)
    public String addAdminService(Model model) {
        model.addAttribute("tblAdminService", new TblAdminService());
        return "com.neha.addadminService";
    }

    @RequestMapping(value = "/viewAdminService", method = RequestMethod.GET)
    public String viewAdminService(Model model) {
        List<TblAdminService> lstAdvertisement = adminServiceService.fetchAllAdminService();
        model.addAttribute("lstAdvertisementTopic", lstAdvertisement);
        return "com.neha.viewadminService";
    }

    @RequestMapping(value = "/saveAdminService", method = RequestMethod.POST)
    public String saveAdminService(@ModelAttribute("tblAdminService") TblAdminService addAdvertisementTopic, HttpServletRequest request, RedirectAttributes redirectAttributes) {
        String response = null;

        if (addAdvertisementTopic.getService_Id() == null) {
            response = adminServiceService.saveAdminService(addAdvertisementTopic);
            redirectAttributes.addFlashAttribute("SuccessMessage", response);
        } else {
            adminServiceService.updateAdminServiceById(addAdvertisementTopic);
            redirectAttributes.addFlashAttribute("UpdateMessage", response);
        }
        if (request.getParameter("save") != null) {
            return "redirect:/viewAdminService";
        } else if (request.getParameter("saveAndNew") != null) {
            return "redirect:/addAdminService";
        }
        return "com.neha.viewAdminService";
    }

    @RequestMapping(value = "/editAdminService/{serviceId}", method = RequestMethod.GET)
    public String editAdminService(Model model, @PathVariable("serviceId") BigInteger serviceId) {
        Object response = adminServiceService.fetchAdminServiceById(serviceId);
        model.addAttribute("tblAdminService", response);
        List<TblAdminService> lsTblAdminServices = adminServiceService.fetchAllAdminService();
        model.addAttribute("lsTblAdminServices", lsTblAdminServices);

        return "com.neha.addadminService";
    }

        @RequestMapping(value = "/deleteAdminService/{serviceId}", method = RequestMethod.GET)
    public String deleteAdminService(@PathVariable("serviceId") BigInteger serviceId, HttpServletRequest request) {
        adminServiceService.deleteAdminServiceById(serviceId);
        return "redirect:/viewAdminService";
    }

}
