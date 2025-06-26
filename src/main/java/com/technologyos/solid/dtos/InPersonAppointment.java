package com.technologyos.solid.dtos;

import java.time.LocalDateTime;

public class InPersonAppointment extends Appointment {
   private final String office;


   public InPersonAppointment(String patient, LocalDateTime appointmentDate, String office) {
      super(patient, appointmentDate);
      this.office = office;
   }

   public String getAppointmentType() {
      return "In Person: " + office;
   }
}
