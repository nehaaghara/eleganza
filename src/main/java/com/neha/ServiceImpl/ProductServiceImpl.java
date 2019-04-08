/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.ServiceImpl;

import com.neha.Repo.ProductRepository;
import com.neha.model.TblProduct;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neha.Service.ProductService;

/**
 *
 * @author ITMCS
 */
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;
    
    @Override
    public String saveProduct(TblProduct tblProduct) {
        tblProduct.setFlag(1);
        productRepository.saveProduct(tblProduct);
        return "Save Successfully";
    }

    @Override
    public List<TblProduct> fetchAllProduct() {
        return productRepository.fetchAllProduct();
    }

    @Override
    public TblProduct fetchProductById(BigInteger productId) {
        return productRepository.fetchProductById(productId);
    }

    @Override
    public String deleteProductById(BigInteger productId) {
        TblProduct tblProduct = new TblProduct();
        tblProduct.setProductId(productId);
        productRepository.deleteProductById(tblProduct);
        return "Delete SuccessFully";
    }

    @Override
    public String updateProductById(TblProduct tblProduct) {
        TblProduct tbloldProduct = productRepository.fetchProductById(tblProduct.getProductId());
        tbloldProduct.setProductName(tblProduct.getProductName());
        tbloldProduct.setDescription(tblProduct.getDescription());
        tbloldProduct.setManufacture(tblProduct.getManufacture());
        tbloldProduct.setCost(tblProduct.getCost());
        tbloldProduct.setFlag(1);
        productRepository.updateProductById(tbloldProduct);
        return "Update Successfully";
    }
    
}
