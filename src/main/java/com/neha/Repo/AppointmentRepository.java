/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.Repo;

import com.neha.model.TblAppointment;
import com.neha.model.TblProduct;
import java.math.BigInteger;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ITMCS
 */
@Repository
public interface AppointmentRepository {

    public TblAppointment saveAppointment(TblAppointment tblAppointment);

    public List<TblAppointment> fetchAllAppointment();

    public TblAppointment fetchAppointmentById(BigInteger appointmentId);

    public void deleteAppointmentById(TblAppointment tblAppointment);

    public void updateAppointmentById(TblAppointment tblAppointment);

}
