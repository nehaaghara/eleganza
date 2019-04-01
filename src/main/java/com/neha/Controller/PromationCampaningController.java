/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Controller;

import com.neha.Service.PromationCampaningService;
import com.neha.model.TblPromationCampaining;
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
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ITMCS-PC
 */
@Controller
public class PromationCampaningController {
    
    @Autowired
    PromationCampaningService promationCampaningService;
    
    ModelAndView mv = new ModelAndView();
    
    @RequestMapping(value = "/PromationCampainingpage")
    public ModelAndView promationpage(HttpServletRequest req) {
        mv.addObject("promationCamp", new TblPromationCampaining());
        mv.setViewName("com.neha.promationcampainingtiles");
        return mv;
    }
    
    @RequestMapping(value = "/savepromationdata", method = RequestMethod.GET)
    public ModelAndView promationdatasave(HttpServletRequest req, @ModelAttribute("promationCamp") TblPromationCampaining tblPromationCampaining) throws ParseException {
        
        tblPromationCampaining.setFlag(true);
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = formatter.parse(tblPromationCampaining.getDate());
        tblPromationCampaining.setPromotionDate(dt);
        formatter = new SimpleDateFormat("HH:mm");
        java.sql.Time timeValue = new java.sql.Time(formatter.parse(tblPromationCampaining.getTime()).getTime());
        tblPromationCampaining.setPromotionTime(timeValue);
        promationCampaningService.promationdatasaveservice(tblPromationCampaining);
        if (req.getParameter("saveAndNew") != null) {
            
            mv.setViewName("redirect:/PromationCampainingpage");
        } else if (req.getParameter("save") != null) {
            mv.setViewName("redirect:/viewpromotionpage");
        } else {
            mv.setViewName("redirect:/viewpromotionpage");
        }
        
        return mv;
    }
    
    @RequestMapping(value = "/viewpromotionpage")
    public ModelAndView viewpageofpromotion(HttpServletRequest req) {
        List<TblPromationCampaining> lstpromotion = promationCampaningService.viewpageofpromotionservice();
        System.out.println("size" + lstpromotion.size());
        mv.addObject("lstpromotion", lstpromotion);
        mv.setViewName("com.neha.viewpromotioncampainingtiles");
        return mv;
    }
    
    @RequestMapping(value = "/editpromotion/{promotionid}")
    public ModelAndView editpromotioncampaining(@PathVariable("promotionid") BigInteger promotionid, Model model) {
        
        TblPromationCampaining promotioncampaining = promationCampaningService.editpromotioncampainingservice(promotionid);
        mv.addObject("promationCamp", promotioncampaining);
        mv.setViewName("com.neha.promationcampainingtiles");
        return mv;
    }
    
    @RequestMapping(value = "/deletepromotion/{promotionid}")
    public ModelAndView deletepromotioncampaining(@PathVariable("promotionid") BigInteger promotionid, Model model) {
        promationCampaningService.deletepromotioncampainingservice(promotionid);
        mv.setViewName("redirect:/viewpromotionpage");
        return mv;
        
    }
    
}
