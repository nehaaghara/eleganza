/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Service;

import com.neha.model.TblAppointment;
import java.math.BigInteger;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS
 */
@Service
public interface AppointmentService {

    public String saveAppointment(TblAppointment tblAppointment);

    public List<TblAppointment> fetchAllAppointment();

    public TblAppointment fetchAppointmentById(BigInteger appointmentId);

    public String deleteAppointmentById(BigInteger appointmentId);

    public String updateAppointmentById(TblAppointment tblAppointment);
}
