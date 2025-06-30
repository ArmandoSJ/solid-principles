package com.technologyos.solid.dtos;

public class AppointmentPrinter {
   public String print(Appointment appointment) {
      return "Appointment for " + appointment.getPatientName() +
         " at " + appointment.getAppointmentDate() +
         " [" + appointment.getAppointmentType() + "]";
   }
}
