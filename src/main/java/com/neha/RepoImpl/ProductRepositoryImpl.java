/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.RepoImpl;

import com.neha.Repo.ProductRepository;
import com.neha.dal.CommonDao;
import com.neha.dal.OperationTypeEnum;
import com.neha.model.TblPackage;
import com.neha.model.TblProduct;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS
 */
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Autowired
    CommonDao commonDao;

    @Override
    public TblProduct saveProduct(TblProduct tblProduct) {
        commonDao.save(tblProduct);
        return tblProduct;
    }

    @Override
    public List<TblProduct> fetchAllProduct() {
        return commonDao.findEntity(TblProduct.class);
    }

    @Override
    public TblProduct fetchProductById(BigInteger productId) {
        List<TblProduct> lstTblPackages  =commonDao.findEntity(TblProduct.class,"productId",OperationTypeEnum.EQ,productId);
        return lstTblPackages.get(0);
    }

    @Override
    public void deleteProductById(TblProduct tblProduct) {
        commonDao.delete(tblProduct);
    }

    @Override
    public void updateProductById(TblProduct tblProduct) {
        commonDao.update(tblProduct);
    }

}
