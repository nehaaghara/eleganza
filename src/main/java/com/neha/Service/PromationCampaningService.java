/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Service;

import com.neha.model.TblPromationCampaining;
import java.math.BigInteger;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS-PC
 */
@Service
public interface PromationCampaningService {

    public void promationdatasaveservice(TblPromationCampaining tblPromationCampaining);

    public List<TblPromationCampaining> viewpageofpromotionservice();

    public TblPromationCampaining editpromotioncampainingservice(BigInteger promotionid);

    public void deletepromotioncampainingservice(BigInteger promotionid);
}
