/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Controller;

import com.neha.Service.AdminPackageService;
import com.neha.Service.AdminPackageServiceMappingService;
import com.neha.Service.AdminServiceService;
import com.neha.bean.AdminPackageServiceBean;
import com.neha.model.TblAdminService;
import com.neha.model.TblPackage;
import com.neha.model.TblPackageService;
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
public class AdminPackageController {

    @Autowired
    AdminPackageService adminPackageService;

    @Autowired
    AdminServiceService adminServiceService;

    @Autowired
    AdminPackageServiceMappingService adminPackageServiceMappingService;

    @RequestMapping(value = "/addAdminPackage", method = RequestMethod.GET)
    public String addAdminService(Model model) {

        List<TblAdminService> lstAdminServices = adminServiceService.fetchAllAdminService();
        model.addAttribute("lstAdminServices", lstAdminServices);

        AdminPackageServiceBean adminPackageServiceBean = new AdminPackageServiceBean();
        List<BigInteger> lstServiceBigInteger = new ArrayList<>();
        for (TblAdminService tblService : adminServiceService.fetchAllAdminService()) {
            lstServiceBigInteger.add(tblService.getService_Id());
        }
        adminPackageServiceBean.setServices(lstServiceBigInteger);
        model.addAttribute("adminPackageServiceBean", adminPackageServiceBean);
        return "com.neha.addadminPackage";
    }

    @RequestMapping(value = "/viewAdminPackage", method = RequestMethod.GET)
    public String viewAdminService(Model model) {
        List<TblPackage> lstPackages = adminPackageService.fetchAllAdminPackage();
        model.addAttribute("lstPackages", lstPackages);
        return "com.neha.viewadminPackage";
    }

    @RequestMapping(value = "/saveAdminPackage", method = RequestMethod.POST)
    public String saveAdminService(@ModelAttribute("adminPackageServiceBean") AdminPackageServiceBean adminPackageServiceBean, HttpServletRequest request, RedirectAttributes redirectAttributes) {
        String response = null;
        List<TblPackageService> lstTblPackageServices = new ArrayList<>();

        if (adminPackageServiceBean.getTblPackage().getPackage_Id() == null) {
            response = adminPackageService.saveAdminPackage(adminPackageServiceBean.getTblPackage());
            redirectAttributes.addFlashAttribute("SuccessMessage", response);

            for (BigInteger service : adminPackageServiceBean.getServices()) {
                TblAdminService tblAdminService = new TblAdminService();
                tblAdminService.setService_Id(service);
                TblPackageService tblPackageService = new TblPackageService();
                tblPackageService.setPackageFk(adminPackageServiceBean.getTblPackage());
                tblPackageService.setServiceFk(tblAdminService);
                tblPackageService.setFlag(1);
                lstTblPackageServices.add(tblPackageService);
            }
            adminPackageServiceMappingService.savePackageService(lstTblPackageServices);
        } else {
            adminPackageService.updateAdminPackageById(adminPackageServiceBean.getTblPackage());
            redirectAttributes.addFlashAttribute("UpdateMessage", response);
            for (BigInteger services : adminPackageServiceBean.getServices()) {
                TblAdminService tblAdminService = new TblAdminService();
                tblAdminService.setService_Id(services);
                TblPackageService tblPackageService = new TblPackageService();
                tblPackageService.setPackageFk(adminPackageServiceBean.getTblPackage());
                tblPackageService.setServiceFk(tblAdminService);
                tblPackageService.setFlag(1);
                lstTblPackageServices.add(tblPackageService);
            }
            adminPackageServiceMappingService.updateBranchById(lstTblPackageServices, adminPackageServiceBean.getTblPackage().getPackage_Id());
        }
        if (request.getParameter("save") != null) {
            return "redirect:/viewAdminPackage";
        } else if (request.getParameter("saveAndNew") != null) {
            return "redirect:/addAdminPackage";
        }
        return "com.neha.viewAdminPackage";
    }

    @RequestMapping(value = "/editAdminPackage/{packageId}", method = RequestMethod.GET)
    public String editAdminService(Model model, @PathVariable("packageId") BigInteger packageId) {

        List<TblAdminService> lstAdminServices = adminServiceService.fetchAllAdminService();
        model.addAttribute("lstAdminServices", lstAdminServices);

        AdminPackageServiceBean adminPackageServiceBean = new AdminPackageServiceBean();
        List<BigInteger> lstServiceBigInteger = new ArrayList<>();
        for (TblAdminService tblAdminService : lstAdminServices) {
            System.out.println("in for::" + tblAdminService.getServiceName());
            lstServiceBigInteger.add(tblAdminService.getService_Id());
        }
        adminPackageServiceBean.setServices(lstServiceBigInteger);

        TblPackage tblPackage = adminPackageService.fetchAdminPackageById(packageId);
        adminPackageServiceBean.setTblPackage(tblPackage);

        List<TblPackageService> lstPackageServices = adminPackageServiceMappingService.fetchServiceById(packageId);
        for(TblPackageService tblPackageService:lstPackageServices){
        }
        adminPackageServiceBean.setLstTblPackageService(lstPackageServices);

        model.addAttribute("lstPackageServices", lstPackageServices);
        model.addAttribute("adminPackageServiceBean", adminPackageServiceBean);
        return "com.neha.addadminPackage";
    }

    @RequestMapping(value = "/deleteAdminPackage/{packageId}", method = RequestMethod.GET)
    public String deleteAdminService(@PathVariable("packageId") BigInteger packageId, HttpServletRequest request) {
        adminPackageService.deleteAdminPackageById(packageId);
        return "redirect:/viewAdminPackage";
    }

}
