package com.technologyos.solid.dtos;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class VirtualAppointment extends Appointment {
   private final String appointmentUrl;

   public VirtualAppointment(String patient, LocalDateTime appointmentDate, String appointmentUrl) {
      super(patient, appointmentDate);
      this.appointmentUrl = appointmentUrl;
   }

   public String getAppointmentType() {
      return "Virtual (" + appointmentUrl + ")";
   }
}
