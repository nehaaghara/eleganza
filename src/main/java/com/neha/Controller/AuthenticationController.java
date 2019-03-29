/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Controller;


import com.neha.Service.AuthenticationService;
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
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ITMCS-PC
 */
@Controller
public class AuthenticationController {

   @Autowired
   AuthenticationService authenticationService;
    
      
    

    ModelAndView mv=new ModelAndView();
    
   
    @RequestMapping(value = "/loginpage")
    public String login(HttpServletRequest req) {
       return "";
    }
    

    @RequestMapping("/registration")
    public String register(HttpServletRequest req) {
        System.out.println("controller");
        TblUserRole  tblUserRole=new TblUserRole();
        TblUser tblUser =new TblUser();
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
