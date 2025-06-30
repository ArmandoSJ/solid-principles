package com.technologyos.solid.dtos;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PhysicalAppointment extends Appointment {
   private final String office;

   public PhysicalAppointment(String patient, LocalDateTime appointmentDate, String office) {
      super(patient, appointmentDate);
      this.office = office;
   }

   @Override
   public String getAppointmentType() {
      return "Physical at : " + office;
   }
}
