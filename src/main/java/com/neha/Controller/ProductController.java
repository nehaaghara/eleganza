/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Controller;

import com.neha.Service.ProductService;
import com.neha.model.TblProduct;
import java.math.BigInteger;
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
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/addproduct", method = RequestMethod.GET)
    public String addProduct(Model model) {
        model.addAttribute("tblProduct", new TblProduct());
        return "com.neha.addProduct";
    }

    @RequestMapping(value = "/viewproduct", method = RequestMethod.GET)
    public String viewProduct(Model model) {
        List<TblProduct> lstProduct = productService.fetchAllProduct();
        model.addAttribute("lstProduct", lstProduct);
        return "com.neha.viewProduct";
    }

    @RequestMapping(value = "/saveproduct", method = RequestMethod.POST)
    public String saveProduct(HttpServletRequest request, @ModelAttribute("tblProduct") TblProduct addtblProduct, RedirectAttributes redirectAttributes) {
        String response = null;
        if (addtblProduct.getProductId() == null) {
            response = productService.saveProduct(addtblProduct);
            redirectAttributes.addFlashAttribute("SuccessMessage", response);
        } else {
            response = productService.updateProductById(addtblProduct);
            redirectAttributes.addFlashAttribute("UpdateMessage", response);
        }
        if (request.getParameter("save") != null) {
            return "redirect:/viewproduct";
        } else if (request.getParameter("saveAndNew") != null) {
            return "redirect:/addproduct";
        }
        return "redirect:/viewproduct";
    }
    
    @RequestMapping(value="/editproduct/{productId}",method=RequestMethod.GET)
    public String editProduct(Model model,@PathVariable("productId")BigInteger productId){
        TblProduct tblProduct = productService.fetchProductById(productId);
        model.addAttribute("tblProduct",tblProduct);
        return "com.neha.addProduct";
    }
    
    @RequestMapping(value="/deleteproduct/{productId}",method = RequestMethod.GET)
    public String deleteProduct(@PathVariable("productId")BigInteger productId){
        productService.deleteProductById(productId);
        return "redirect:/viewproduct";
    }
}
