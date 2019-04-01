/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Controller;

import com.neha.Service.AdminPackageService;
import com.neha.Service.AdminServiceService;
import com.neha.model.TblAdminService;
import com.neha.model.TblPackage;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author ITMCS
 */
@Controller
public class AdminPackageController {

    @Autowired
    AdminPackageService adminPackageService;

    @Autowired
    AdminServiceService adminServiceService;

    @RequestMapping(value = "/addAdminPackage", method = RequestMethod.GET)
    public String addAdminService(Model model) {
        model.addAttribute("tblPackage", new TblPackage());
        model.addAttribute("lstAdvertisementTopic", adminServiceService.fetchAllAdvertismentTopic());
        return "com.neha.addadminPackage";
    }

    @RequestMapping(value = "/viewAdminPackage", method = RequestMethod.GET)
    public String viewAdminService(Model model) {
        List<TblPackage> lstAdvertisement = adminPackageService.fetchAllAdvertismentTopic();
        model.addAttribute("lstAdvertisementTopic", lstAdvertisement);
        return "com.neha.viewadminPackage";
    }

    @RequestMapping(value = "/saveAdminPackage", method = RequestMethod.POST)
    public String saveAdminService(@ModelAttribute("tblAdminService") TblPackage addAdvertisementTopic, HttpServletRequest request, RedirectAttributes redirectAttributes) {
        String response = null;

        if (addAdvertisementTopic.getServiceId() == null) {
            response = adminPackageService.saveAdvertismentTopic(addAdvertisementTopic);
            redirectAttributes.addFlashAttribute("SuccessMessage", response);
        } else {
            //      advertisementService.updateAdvertismentTopicById(addAdvertisementTopic);
            redirectAttributes.addFlashAttribute("UpdateMessage", response);
        }
        if (request.getParameter("save") != null) {
            return "redirect:/viewAdminPackage";
        } else if (request.getParameter("saveAndNew") != null) {
            return "redirect:/addAdminPackage";
        }
        return "com.neha.viewAdminPackage";
    }

}
