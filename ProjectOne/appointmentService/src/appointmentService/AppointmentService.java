package appointmentService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppointmentService {
    private List<Appointment> appointments;

    public AppointmentService() {
        appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void deleteAppointment(String appointmentId) {
        Iterator<Appointment> iterator = appointments.iterator();
        while (iterator.hasNext()) {
            Appointment appointment = iterator.next();
            if (appointment.getAppointmentId().equals(appointmentId)) {
                iterator.remove();
                return;
            }
        }
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }
    
    public Appointment getAppointment(String appointmentId) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentId().equals(appointmentId)) {
                return appointment;
            }
        }
        return null;
    }
}
