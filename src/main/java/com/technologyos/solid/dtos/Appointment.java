package com.technologyos.solid.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Appointment {
   private String patientName;
   private LocalDateTime appointmentDate;

   public abstract String getAppointmentType();
}
