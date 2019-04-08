/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Service;

import com.neha.model.TblProduct;
import java.math.BigInteger;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS
 */
@Service
public interface ProductService {
    public String saveProduct(TblProduct tblProduct);
    public List<TblProduct> fetchAllProduct();
    public TblProduct fetchProductById(BigInteger productId);
    public String deleteProductById(BigInteger productId);
    public String updateProductById(TblProduct tblProduct);
}
