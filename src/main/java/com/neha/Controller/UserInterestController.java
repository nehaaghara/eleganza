/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Controller;

import com.neha.Service.AdvertisementService;
import com.neha.Service.AuthenticationService;
import com.neha.Service.UserInterestService;
import com.neha.model.TblAdvertisementTopic;
import com.neha.model.TblUser;
import com.neha.model.TblUserInterest;
import java.math.BigInteger;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
public class UserInterestController {

    @Autowired
    AuthenticationService authenticationService;
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
    public String viewUserInterest(Model model, HttpServletRequest request) {
        TblUser lstuser = (TblUser) request.getSession(false).getAttribute("sessionuser");
        String role = lstuser.getTblUserRole().getRoleName();
        List<TblUserInterest> lstUserInterests = null;
        if (role.equalsIgnoreCase("admin")) {
            System.out.println("in if");
            lstUserInterests = userInterestService.fetchAllUserInterestTopic();
          
            model.addAttribute("lstUserInterest", lstUserInterests);
            return "com.neha.viewAllUserInterest";
        } else {
            System.out.println("in else::"+lstuser.getUserid());
            lstUserInterests = userInterestService.fetchUserInterestById(lstuser.getUserid());
            model.addAttribute("lstUserInterest", lstUserInterests);
            return "com.neha.viewUserInterest";
        }

    }

    @RequestMapping(value = "/saveuserinterest", method = RequestMethod.POST)
    public String saveUserInterest(@ModelAttribute("tblUserInterest") TblUserInterest addUserInterest, HttpServletRequest request, RedirectAttributes redirectAttributes) {
        String response = null;

        TblUser tblUser = new TblUser();
        TblUser lstuser = (TblUser) request.getSession(false).getAttribute("sessionuser");
        tblUser.setUserid(lstuser.getUserid());
        addUserInterest.setUserId(tblUser);
        if (addUserInterest.getInterestId() == null) {
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
        return "redirect:/viewuserinterest";
    }

    @RequestMapping(value = "/edituserinterest/{interestId}", method = RequestMethod.GET)
    public String editUserInterest(Model model, @PathVariable("interestId") BigInteger interestId) {
        Object response = userInterestService.fetchUserInterestTopicById(interestId);
        model.addAttribute("tblUserInterest", response);
        List<TblAdvertisementTopic> lstAdvertisementTopics = advertisementService.fetchAllAdvertismentTopic();
        model.addAttribute("lstAdvertisementTopics", lstAdvertisementTopics);

        return "com.neha.addUserInterest";
    }

    @RequestMapping(value = "/deleteuserinterest/{interestId}", method = RequestMethod.GET)
    public String deleteUserInterest(@PathVariable("interestId") BigInteger interestId, HttpServletRequest request) {
        userInterestService.deleteUserInterestTopicById(interestId);
        return "redirect:/viewuserinterest";
    }

}
