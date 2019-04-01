/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Controller;

import com.neha.Service.AdvertisementService;
import com.neha.Service.AuthenticationService;
import com.neha.Service.PromationCampaningService;
import com.neha.Service.UserProfileService;
import com.neha.model.TblUser;
import com.neha.model.TblUserRole;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ITMCS-PC
 */
@Controller
public class AuthenticationController {

    @Autowired
    AuthenticationService authenticationService;
    
    @Autowired
    AdvertisementService advertisementService;
    
    @Autowired
    PromationCampaningService promotionCampaningService;
    
    @Autowired
            UserProfileService userService;

    ModelAndView mv = new ModelAndView();

    @RequestMapping(value = "/loginpage", method = RequestMethod.GET)
    public String login(HttpServletRequest req,Model model) {
        TblUser tblUser = new TblUser();
        String email = req.getParameter("emailAddress");
        String password = req.getParameter("password");
        tblUser.setEmail_address(email);
        tblUser.setPassword(password);
        List<TblUser> lstuser = authenticationService.loginservice(tblUser);
        HttpSession session = req.getSession(true);
        if(lstuser!=null && !lstuser.isEmpty()){
        session.setAttribute("sessionuser", lstuser.get(0));
        }
        if (lstuser.size() > 0) {
            if (lstuser.get(0).getTblUserRole().getRolePK().equals(new BigInteger("1"))) {
                model.addAttribute("lstAdvertisement",advertisementService.fetchAllAdvertismentTopic());
                model.addAttribute("lstPromotions",promotionCampaningService.viewpageofpromotionservice());
                model.addAttribute("lstUsers",userService.fetchAllUser());
                return "com.neha.adminIndex";
            } else {
                return "com.neha.userIndex";
            }

        } else {
            return "Login/registration";
        }
    }

    @RequestMapping("/registration")
    public String register(HttpServletRequest req) {
        System.out.println("controller");
        TblUserRole tblUserRole = new TblUserRole();
        TblUser tblUser = new TblUser();
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");
        String address = req.getParameter("address");
        String city = req.getParameter("city");
        int pincode = Integer.parseInt(req.getParameter("pincode"));
        String state = req.getParameter("state");
        int phonenumber = Integer.parseInt(req.getParameter("phonenumber"));
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String conformpassword = req.getParameter("conformpassword");
        tblUser.setFirst_name(firstname);
        tblUser.setLast_name(lastname);
        tblUser.setEmail_address(email);
        tblUser.setGender(gender);
        tblUser.setAddress(address);
        tblUser.setState(state);
        tblUser.setCity(city);
        tblUser.setPincode(pincode);
        tblUser.setPassword(password);
        tblUser.setConformpassword(conformpassword);
        tblUser.setContect(phonenumber);
        tblUser.setUsername(username);
        tblUserRole.setRolePK(new BigInteger("2"));
        tblUser.setTblUserRole(tblUserRole);
        tblUser.setFlag(true);
        authenticationService.registerservice(tblUser);

        return "redirect:/registrationindex";
    }
}
