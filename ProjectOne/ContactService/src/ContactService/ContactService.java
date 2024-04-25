package ContactService;

import java.util.ArrayList;
import java.util.Iterator;

public class ContactService {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    private ArrayList<Contact> contacts;

    public ContactService() {
        contacts = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean deleteContact(String contactID) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getContactID().equals(contactID)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public boolean updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
        for (Contact contact : contacts) {
            if (contact.getContactID().equals(contactID)) {
                boolean updated = false;
                if (firstName != null && !firstName.isEmpty() && firstName.length() <= 10) {
                    contact.setFirstName(firstName);
                    updated = true;
                }
                if (lastName != null && !lastName.isEmpty() && lastName.length() <= 10) {
                    contact.setLastName(lastName);
                    updated = true;
                }
                if (phoneNumber != null && !phoneNumber.isEmpty() && phoneNumber.length() == 10) {
                    contact.setPhone(phoneNumber);
                    updated = true;
                }
                if (address != null && !address.isEmpty() && address.length() <= 30) {
                    contact.setAddress(address);
                    updated = true;
                }
                return updated;
            }
        }
        return false;
    }

}
