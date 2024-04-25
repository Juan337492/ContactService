package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;

import appointmentService.Appointment;
import appointmentService.AppointmentService;

class AppointmentServiceTest {

    @Test
    void testAddAppointment() {
        // Create an appointment service
        AppointmentService appointmentService = new AppointmentService();
        
        // Create an appointment
        Appointment appointment = new Appointment("1234567890", new Date(), "Test Appointment");
        
        // Add the appointment to the service
        appointmentService.addAppointment(appointment);
        
        // Retrieve the appointment from the service and assert that it's the same as the one added
        assertEquals(appointment, appointmentService.getAppointment("1234567890"));
    }

    @Test
    void testDeleteAppointment() {
        // Create an appointment service
        AppointmentService appointmentService = new AppointmentService();
        
        // Create an appointment
        Appointment appointment = new Appointment("1234567890", new Date(), "Test Appointment");
        
        // Add the appointment to the service
        appointmentService.addAppointment(appointment);
        
        // Delete the appointment from the service
        appointmentService.deleteAppointment("1234567890");
        
        // Assert that the appointment is no longer present in the service
        assertNull(appointmentService.getAppointment("1234567890"));
    }
}
