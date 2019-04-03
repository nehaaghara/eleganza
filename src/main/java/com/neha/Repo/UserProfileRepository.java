/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Repo;

import com.neha.model.TblUser;
import java.math.BigInteger;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS
 */
@Repository
public interface UserProfileRepository {
    public void updateProfileInformation(TblUser tblUser);
    public TblUser fetchById(BigInteger userId);
    public List<TblUser> fetchAllUser();
    public TblUser fetchpasswordById(BigInteger userId,HttpServletRequest request);
    public void updatePasswordById(TblUser tblUser);
}
