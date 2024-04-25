package appointmentService;

import java.util.Date;

public class Appointment {
    private static final int MAX_ID_LENGTH = 10;
    private static final int MAX_DESCRIPTION_LENGTH = 50;

    private String appointmentId;
    private Date appointmentDate;
    private String description;

    // Constructor
    public Appointment(String appointmentId, Date appointmentDate, String description) {
        if (appointmentId == null || appointmentId.length() > MAX_ID_LENGTH) {
            throw new IllegalArgumentException("Appointment ID must be non-null and have length <= " + MAX_ID_LENGTH);
        }
        if (description == null || description.length() > MAX_DESCRIPTION_LENGTH) {
            throw new IllegalArgumentException("Description must be non-null and have length <= " + MAX_DESCRIPTION_LENGTH);
        }
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.description = description;
    }

    // Getter for appointmentId (no setter to ensure it's not updatable)
    public String getAppointmentId() {
        return appointmentId;
    }

    // Getters and setters for appointmentDate
    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    // Getters and setters for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description == null || description.length() > MAX_DESCRIPTION_LENGTH) {
            throw new IllegalArgumentException("Description must be non-null and have length <= " + MAX_DESCRIPTION_LENGTH);
        }
        this.description = description;
    }
}
