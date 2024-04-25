package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;

import appointmentService.Appointment;

class AppointmentTest {

    @Test
    void testGetters() {
        // Created an appointment object
        Appointment appointment = new Appointment("1234567890", new Date(), "Test Appointment");
        
        // Testing the getters
        assertEquals("1234567890", appointment.getAppointmentId());
        assertNotNull(appointment.getAppointmentDate());
        assertEquals("Test Appointment", appointment.getDescription());
    }
}
