package com.technologyos.solid.dtos;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class VirtualAppointment extends Appointment {
   private final String videoCallLink;

   public VirtualAppointment(String patient, LocalDateTime appointmentDate, String videoCallLink) {
      super(patient, appointmentDate);
      this.videoCallLink = videoCallLink;
   }

   @Override
   public String getAppointmentType() {
      return "Virtual via " + videoCallLink;
   }
}
