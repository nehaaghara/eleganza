/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Service;

import com.neha.model.TblAdminService;
import com.neha.model.TblAdvertisementTopic;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS
 */
@Service
public interface AdminServiceService {

    public String saveAdvertismentTopic(TblAdminService tblAdminService);

    public List<TblAdminService> fetchAllAdvertismentTopic();

}
