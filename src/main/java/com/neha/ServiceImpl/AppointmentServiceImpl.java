/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neha.ServiceImpl;

import com.neha.Repo.AppointmentRepository;
import com.neha.Service.AppointmentService;
import com.neha.model.TblAppointment;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ITMCS
 */
@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    @Override
    public String saveAppointment(TblAppointment tblAppointment) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date dt;
        try {
            dt = formatter.parse(tblAppointment.getTransientdate());
            tblAppointment.setDate(dt);
            formatter = new SimpleDateFormat("HH:mm");
            java.sql.Time timeValue = new java.sql.Time(formatter.parse(tblAppointment.getTransienttime()).getTime());
            tblAppointment.setTime(timeValue);
            appointmentRepository.saveAppointment(tblAppointment);
            return "Save Successfully";
        } catch (ParseException ex) {
           ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<TblAppointment> fetchAllAppointment() {
        return appointmentRepository.fetchAllAppointment();
    }

    @Override
    public TblAppointment fetchAppointmentById(BigInteger appointmentId) {
        return appointmentRepository.fetchAppointmentById(appointmentId);
    }

    @Override
    public String deleteAppointmentById(BigInteger appointmentId) {
        TblAppointment tblAppointment = new TblAppointment();
        tblAppointment.setAppointmentId(appointmentId);
        appointmentRepository.deleteAppointmentById(tblAppointment);
        return "Delete SuccessFully";
    }

    @Override
    public String updateAppointmentById(TblAppointment tblAppointment) {
        TblAppointment oldvalue = appointmentRepository.fetchAppointmentById(tblAppointment.getAppointmentId());
        oldvalue.setUserFk(tblAppointment.getUserFk());
        oldvalue.setDate(tblAppointment.getDate());
        oldvalue.setTime(tblAppointment.getTime());
        oldvalue.setDiscount(tblAppointment.getDiscount());
        oldvalue.setFlag(1);
        appointmentRepository.updateAppointmentById(tblAppointment);
        return "Update Successfully";
    }

}
