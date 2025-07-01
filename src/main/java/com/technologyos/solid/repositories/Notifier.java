package com.technologyos.solid.repositories;

import com.technologyos.solid.dtos.AppointmentDto;

public interface Notifier {
   void notify(AppointmentDto appointment);
}
