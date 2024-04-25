package ContactService;

public class Contact {
    private String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    
    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
        setContactID(contactID);
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setAddress(address);
    }

    // Constructors, getters, and setters
    public String getContactID() {
        return contactID;
    }

    public void setContactID(String contactID) {
        if (contactID != null && contactID.length() <= 10) {
            this.contactID = contactID;
        } else {
            throw new IllegalArgumentException("Contact ID must not be null and cannot exceed 10 characters.");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && firstName.length() <= 10) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("First name must not be null and cannot exceed 10 characters.");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && lastName.length() <= 10) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Last name must not be null and cannot exceed 10 characters.");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone != null && phone.length() == 10) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Phone number must not be null and must be exactly 10 digits.");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null && address.length() <= 30) {
            this.address = address;
        } else {
            throw new IllegalArgumentException("Address must not be null and cannot exceed 30 characters.");
        }
    }
}
