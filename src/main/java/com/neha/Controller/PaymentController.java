/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Controller;

import com.neha.Service.AdminPackageService;
import com.neha.Service.PaymentService;
import com.neha.Utility.CustomUtility;
import com.neha.model.TblPayment;
import com.neha.model.TblUser;
import java.math.BigInteger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ITMCS
 */
@Controller
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @Autowired
    AdminPackageService adminPackageService;
    
   
    @RequestMapping(value = "/addPayment", method = RequestMethod.GET)
    public String addPayment(Model model) {
        model.addAttribute("lstPackages", adminPackageService.fetchAllAdminPackage());
        model.addAttribute("tblPayment", new TblPayment());
        return "com.neha.addPayment";
    }

    @RequestMapping(value = "/viewPayment", method = RequestMethod.GET)
    public String viewPayment(Model model) {
        model.addAttribute("lstPayments", paymentService.fetchAllPayment());
        return "com.neha.viewPayment";
    }

    @RequestMapping(value = "/savepayment", method = RequestMethod.POST)
    public String savePayment(HttpServletRequest request, @ModelAttribute("tblPayment") TblPayment tblPayment) {
        System.out.println("in controller");
        TblUser tblUser = new TblUser();
        TblUser lstuser = (TblUser) request.getSession(false).getAttribute("sessionuser");
        tblUser.setUserid(lstuser.getUserid());
        tblPayment.setUserFk(tblUser);
        paymentService.savePayment(tblPayment);
        if (request.getParameter("save") != null) {
            return "redirect:/viewPayment";
        } else if (request.getParameter("saveAndNew") != null) {
            return "redirect:/addPayment";
        }
        return "com.neha.viewPayment";
    }

    @ResponseBody
    @RequestMapping(value = "/fetchAmount", method = RequestMethod.POST)
    public String fetchAmount(HttpServletRequest request, Model model) {
        try {
            Object response = null;
            if (null != request.getParameter("packageFk")) {
                BigInteger packageFk = new BigInteger(request.getParameter("packageFk"));
                response = adminPackageService.fetchAdminPackageById(packageFk);
                System.out.println("response::" + response);
            }
            String result = CustomUtility.convertToJsonString(response);
            System.out.println("result::" + result);
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            return "redirect:/error";
        }
    }
}
