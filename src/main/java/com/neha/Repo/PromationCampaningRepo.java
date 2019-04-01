/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Repo;

import com.neha.model.TblPromationCampaining;
import java.math.BigInteger;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS-PC
 */
@Repository
public interface PromationCampaningRepo {

    public void promationdatasaverepo(TblPromationCampaining tblPromationCampaining);

    public List<TblPromationCampaining> viewpageofpromotionrepo();

    public TblPromationCampaining editpromotioncampainingrepo(BigInteger promotionid);

    public void deletepromotioncampainingrepo(BigInteger promotionid);

}
