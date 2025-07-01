package com.technologyos.solid.service;

import com.technologyos.solid.dtos.AppointmentDto;
import com.technologyos.solid.repositories.Notifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentNotifierService {
   private final List<Notifier> notifiers;

   public AppointmentNotifierService(List<Notifier> notifiers) {
      this.notifiers = notifiers;
   }

   public void schedule(AppointmentDto appointment) {
      // Aquí agendarías la cita (guardar en base de datos)

      // Notificar por todos los medios disponibles
      for (Notifier notifier : notifiers) {
         notifier.notify(appointment);
      }
   }
}
