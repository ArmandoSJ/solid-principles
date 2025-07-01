package com.technologyos.solid.service;

import com.technologyos.solid.dtos.AppointmentDto;
import com.technologyos.solid.repositories.Notifier;
import org.springframework.stereotype.Service;

@Service
public class SmsNotifier implements Notifier {

   @Override
   public void notify(AppointmentDto appointment) {
      System.out.println("Sending SMS to: " + appointment.getPatientName());
   }
}
