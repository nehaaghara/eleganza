/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Service;

import com.neha.model.TblUser;
import java.math.BigInteger;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS
 */
@Service
public interface UserProfileService {
    public String updateProfileInformation(TblUser tblUser,HttpServletRequest request);
   public List<TblUser> fetchAllUser();
   public String updatePasswordById(TblUser tblUser,HttpServletRequest request);
}
