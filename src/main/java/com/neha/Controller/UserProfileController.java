/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Controller;

import com.neha.Service.UserProfileService;
import com.neha.model.TblUser;
import java.math.BigInteger;
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
 * @author ITMCS*
 */
@Controller
public class UserProfileController {

    @Autowired
    UserProfileService userProfileService;

    @RequestMapping(value = "/profileInformation", method = RequestMethod.GET)
    public String profile(Model model, HttpServletRequest request) {
        model.addAttribute("tblUser", new TblUser());
        return "com.neha.userProfile";
    }

    @RequestMapping(value = "/updateprofile/{userid}", method = RequestMethod.POST)
    public String UpdateProfileInformation(@PathVariable("userid") BigInteger userid, HttpServletRequest request, @ModelAttribute("tblUser") TblUser updateUser) {
        userProfileService.updateProfileInformation(updateUser, request);
        TblUser lstuser = (TblUser) request.getSession(false).getAttribute("sessionuser");
        String role = lstuser.getTblUserRole().getRoleName();

        if (request.getParameter("save") != null) {
            if (role.equalsIgnoreCase("admin")) {
                return "redirect:/dashboard";
            }
            if (role.equalsIgnoreCase("user")) {
                return "redirect:/userdashboard";
            }
        }
        return "com.neha.userProfile";
    }

    @RequestMapping(value = "/changePassword", method = RequestMethod.GET)
    public String changePassword(Model model) {
        model.addAttribute("tblUser", new TblUser());
        return "com.neha.changePassword";
    }

    @RequestMapping(value = "/resetPassword/{userid}", method = RequestMethod.POST)
    public String resetPassword(Model model,HttpServletRequest request, @ModelAttribute("tblUser") TblUser changepassword, @PathVariable("userid") BigInteger userid, RedirectAttributes redirectAttributes) {
        TblUser lstuser = (TblUser) request.getSession(false).getAttribute("sessionuser");
        String role = lstuser.getTblUserRole().getRoleName();

        String response = userProfileService.updatePasswordById(changepassword, request);
        System.out.println("response::" + response);
        redirectAttributes.addFlashAttribute("Message", response);  
        if (response.equalsIgnoreCase("Update Successfully")) {
            if (request.getParameter("save") != null) {
                if (role.equalsIgnoreCase("admin")) {
                    return "redirect:/dashboard";
                }
                if (role.equalsIgnoreCase("user")) {
                    return "redirect:/userdashboard";
                }
            }
        }
        if (response.equalsIgnoreCase("Enter correct Old Password")) {
            model.addAttribute("errorMessage","Please Enter correct Old Password");
            return "com.neha.changePassword";
        }
        return "com.neha.changePassword";
    }
}
