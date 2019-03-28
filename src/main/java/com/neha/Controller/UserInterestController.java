/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Controller;

import com.neha.model.TblAdvertisementTopic;
import com.neha.model.TblUserInterest;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
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
public class UserInterestController {

    @RequestMapping(value = "/adduserinterest", method = RequestMethod.GET)
    public String addUserInterest(Model model) {
        model.addAttribute("tblUserInterest", new TblUserInterest());
        return "com.neha.addUserInterest";
    }

    @RequestMapping(value = "/viewuserinterest", method = RequestMethod.GET)
    public String viewUserInterest(Model model) {
        //   model.addAttribute("lstUserInterest", lstAdvertisement);
        return "com.neha.viewUserInterest";
    }

    @RequestMapping(value = "/saveUserInterest", method = RequestMethod.POST)
    public String saveUserInterest(@ModelAttribute("tblUserInterest") TblUserInterest addUserInterest, HttpServletRequest request, RedirectAttributes redirectAttributes) {
        String response = null;

//        if (addAdvertisementTopic.getTopic_Id() == null) {
//            response = advertisementService.saveAdvertismentTopic(addAdvertisementTopic);
//            redirectAttributes.addFlashAttribute("SuccessMessage", response);
//        } else {
//            advertisementService.updateAdvertismentTopicById(addAdvertisementTopic);
//            redirectAttributes.addFlashAttribute("UpdateMessage", response);
//        }
        if (request.getParameter("save") != null) {
            return "redirect:/viewuserinterest";
        } else if (request.getParameter("saveAndNew") != null) {
            return "redirect:/adduserinterest";
        }
        return "com.damani.viewuserinterest";
    }

}
