/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.RepoImpl;

import com.neha.Repo.PromationCampaningRepo;
import com.neha.dal.CommonDao;
import com.neha.dal.OperationTypeEnum;
import com.neha.model.TblPromationCampaining;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS-PC
 */
@Repository
public class PromationCampaningRepoImpl implements PromationCampaningRepo {

    @Autowired
    CommonDao commonDao;

    @Override
    public void promationdatasaverepo(TblPromationCampaining tblPromationCampaining) {
        if (tblPromationCampaining.getPromotionid() != null) {
            commonDao.saveOrUpdate(tblPromationCampaining);
        } else {
            commonDao.save(tblPromationCampaining);

        }

    }

    @Override
    public List<TblPromationCampaining> viewpageofpromotionrepo() {
        System.out.println("in repo");
        return commonDao.findEntity(TblPromationCampaining.class);
    }

    @Override
    public TblPromationCampaining editpromotioncampainingrepo(BigInteger promotionid) {
        List<TblPromationCampaining> lstpromotion = commonDao.findEntity(TblPromationCampaining.class, "promotionid", OperationTypeEnum.EQ, promotionid);
        return lstpromotion.get(0);
    }

    @Override
    public void deletepromotioncampainingrepo(BigInteger promotionid) {
        List<TblPromationCampaining> lstpromotion = commonDao.findEntity(TblPromationCampaining.class, "promotionid", OperationTypeEnum.EQ, promotionid);
        commonDao.delete(lstpromotion.get(0));
    }

}
