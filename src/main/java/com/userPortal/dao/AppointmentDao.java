package com.userPortal.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.userPortal.domain.Appointment;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}
