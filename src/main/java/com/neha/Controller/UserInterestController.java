/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Controller;

import com.neha.Service.AdvertisementService;
import com.neha.Service.UserInterestService;
import com.neha.model.TblAdvertisementTopic;
import com.neha.model.TblUserInterest;
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
public class UserInterestController {

    @Autowired
    UserInterestService userInterestService;

    @Autowired
    AdvertisementService advertisementService;

    @RequestMapping(value = "/adduserinterest", method = RequestMethod.GET)
    public String addUserInterest(Model model) {
        List<TblAdvertisementTopic> lstAdvertisementTopics = advertisementService.fetchAllAdvertismentTopic();
        model.addAttribute("lstAdvertisementTopics", lstAdvertisementTopics);
        model.addAttribute("tblUserInterest", new TblUserInterest());
        return "com.neha.addUserInterest";
    }

    @RequestMapping(value = "/viewuserinterest", method = RequestMethod.GET)
    public String viewUserInterest(Model model) {
        //   model.addAttribute("lstUserInterest", lstAdvertisement);
        return "com.neha.viewUserInterest";
    }

    @RequestMapping(value = "/saveuserinterest", method = RequestMethod.POST)
    public String saveUserInterest(@ModelAttribute("tblUserInterest") TblUserInterest addUserInterest, HttpServletRequest request, RedirectAttributes redirectAttributes) {
        System.out.println("in controller");
            String response = null;
        if (addUserInterest.getInterestId() == null) {
            System.out.println("IN IF::" + addUserInterest.getTopic_Id().getTitle());
            response = userInterestService.saveUserInterestTopic(addUserInterest);
            redirectAttributes.addFlashAttribute("SuccessMessage", response);
        } else {
            response = userInterestService.updateUserInterestTopicById(addUserInterest);
            redirectAttributes.addFlashAttribute("UpdateMessage", response);
        }
        if (request.getParameter("save") != null) {
            return "redirect:/viewuserinterest";
        } else if (request.getParameter("saveAndNew") != null) {
            return "redirect:/adduserinterest";
        }
        return "com.neha.viewUserInterest";
    }

}
