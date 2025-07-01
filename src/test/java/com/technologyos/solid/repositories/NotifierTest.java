package com.technologyos.solid.repositories;

import com.technologyos.solid.dtos.AppointmentDto;
import com.technologyos.solid.service.AppointmentNotifierService;
import com.technologyos.solid.service.SmsNotifier;
import com.technologyos.solid.service.WhatsappNotifier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.List;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class NotifierTest {
   @Mock
   private SmsNotifier smsNotifier;

   @Mock
   private WhatsappNotifier whatsappNotifier;

   @InjectMocks
   private AppointmentNotifierService appointmentNotifierService;

   @BeforeEach
   void setUp() {
      List<Notifier> notifiers = List.of(smsNotifier, whatsappNotifier);
      appointmentNotifierService = new AppointmentNotifierService(notifiers);
   }

   @Test
   void shouldNotifyAllNotifiersWhenAppointmentIsScheduled() {
      // Arrange
      AppointmentDto appointment = new AppointmentDto();
      appointment.setPatientName("Armando Salazar");
      appointment.setAppointmentDate(LocalDateTime.now());

      // Act
      appointmentNotifierService.schedule(appointment);

      // Assert
      verify(smsNotifier, times(1)).notify(appointment);
      verify(whatsappNotifier, times(1)).notify(appointment);
   }
}
