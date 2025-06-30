package com.technologyos.solid.dtos;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {

   private final AppointmentPrinter printer = new AppointmentPrinter();

   @Test
   void should_print_virtual_and_physical_appointments_without_error() {
      // Arrange
      Appointment virtual = new VirtualAppointment("Jaime", LocalDateTime.of(2025, 7, 10, 14, 0), "https://zoom.com/abc123");
      Appointment inPerson = new PhysicalAppointment("Armando", LocalDateTime.of(2025, 7, 11, 10, 0), "Room 205");

      // Act
      String virtualResult = printer.print(virtual);
      String inPersonResult = printer.print(inPerson);

      // Assert
      assertTrue(virtualResult.contains("Virtual via"));
      assertTrue(inPersonResult.contains("Physical at"));
   }

}
