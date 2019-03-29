/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ITMCS-PC
 */
@Controller
public class IndexController {
    
    @RequestMapping(value = "/")
    public String index() {
        System.out.println("vikas");
        return "Login/userLogin";
    }
   @RequestMapping(value="/dashboard")
    public String dashboard(){
        return "Login/registration";
    }
    @RequestMapping(value = "/loginindex")
    public String login() {
        return "/Login/userLogin";
    }

    @RequestMapping(value = "/registrationindex")
    public String registration() {
        return "Login/registration";
    }
    
    @RequestMapping(value="/logout")
    public String logout(HttpServletRequest request){
        HttpSession session= request.getSession();
        session.invalidate();
        return "redirect:/loginindex";
    }
    
    
}
