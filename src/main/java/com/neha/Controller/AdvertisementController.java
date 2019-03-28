/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Controller;

import com.neha.Service.AdvertisementService;
import com.neha.model.TblAdvertisementTopic;
import java.math.BigInteger;
import java.util.ArrayList;
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
public class AdvertisementController {

    @Autowired
    AdvertisementService advertisementService;

    @RequestMapping(value = "/addAdvertisement", method = RequestMethod.GET)
    public String addAdvertismentTopic(Model model) {
        model.addAttribute("tblAdvertisementTopic", new TblAdvertisementTopic());
        return "com.neha.addAdvertisementTopic";
    }

    @RequestMapping(value = "/viewAdvertisement", method = RequestMethod.GET)
    public String viewAdvertismentTopic(Model model) {
        List<TblAdvertisementTopic> lstAdvertisement = advertisementService.fetchAllAdvertismentTopic();
        model.addAttribute("lstAdvertisementTopic", lstAdvertisement);
        return "com.neha.viewAdvertisementTopic";
    }

    @RequestMapping(value = "/saveAdvertisement", method = RequestMethod.POST)
    public String saveAdvertisement(@ModelAttribute("tblAdvertisementTopic") TblAdvertisementTopic addAdvertisementTopic, HttpServletRequest request, RedirectAttributes redirectAttributes) {
        String response = null;

        if (addAdvertisementTopic.getTopic_Id() == null) {
            response = advertisementService.saveAdvertismentTopic(addAdvertisementTopic);
            redirectAttributes.addFlashAttribute("SuccessMessage", response);
        } else {
            advertisementService.updateAdvertismentTopicById(addAdvertisementTopic);
            redirectAttributes.addFlashAttribute("UpdateMessage", response);
        }
        if (request.getParameter("save") != null) {
            return "redirect:/viewAdvertisement";
        } else if (request.getParameter("saveAndNew") != null) {
            return "redirect:/addAdvertisement";
        }
        return "com.damani.viewAdvertisement";
    }

    @RequestMapping(value = "/editAdvertisement/{topic_Id}", method = RequestMethod.GET)
    public String editAdvertisement(Model model, @PathVariable("topic_Id") BigInteger topic_Id) {
        Object response = advertisementService.fetchAdvertismentTopicById(topic_Id);
        model.addAttribute("tblAdvertisementTopic", response);
        return "com.neha.addAdvertisementTopic";
    }

    @RequestMapping(value = "/deleteAdvertisement/{topic_Id}", method = RequestMethod.GET)
    public String deleteAdvertisement(@PathVariable("topic_Id") BigInteger topic_Id, HttpServletRequest request) {
        advertisementService.deleteAdvertismentTopicById(topic_Id);
        return "redirect:/viewAdvertisement";
    }

}
