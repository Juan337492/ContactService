package test;
import static org.junit.Assert.*;
import org.junit.Test;
import ContactService.ContactService;
import ContactService.Contact;

public class ContactServiceTest {

    @Test
    public void testAddContact() {
        ContactService cs = new ContactService();
        Contact testContact = new Contact("1234567890", "Juan", "Pablo", "1234567890", "Sample Address");
        assertTrue(cs.addContact(testContact));
    }

    @Test
    public void testDeleteContact() {
        ContactService cs = new ContactService();
        Contact testContact = new Contact("1234567890", "Juan", "Pablo", "1234567890", "Sample Address");
        cs.addContact(testContact);
        assertTrue(cs.deleteContact("1234567890"));
    }

    @Test
    public void testUpdateContact() {
        ContactService cs = new ContactService();
        Contact testContact = new Contact("1234567890", "Juan", "Pablo", "1234567890", "Sample Address");
        cs.addContact(testContact);
        assertTrue(cs.updateContact("1234567890", "Juan", null, null, null));
        assertEquals("Juan", testContact.getFirstName());
    }
}
