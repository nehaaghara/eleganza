/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Repo;

import com.neha.model.TblPackage;
import com.neha.model.TblProduct;
import java.math.BigInteger;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS
 */
@Repository
public interface ProductRepository {

    public TblProduct saveProduct(TblProduct tblProduct);

    public List<TblProduct> fetchAllProduct();

    public TblProduct fetchProductById(BigInteger productId);

    public void deleteProductById(TblProduct tblProduct);

    public void updateProductById(TblProduct tblProduct);
}
