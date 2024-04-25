package test; 
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ContactService.Contact;

public class TestContact {
	 @Test
	    public void testContactID() {
	        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "Sample Address");
	        assertEquals("1234567890", contact.getContactID());
	    }

	    @Test
	    public void testFirstName() {
	        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "Sample Address");
	        assertEquals("John", contact.getFirstName());
	    }

	    @Test
	    public void testLastName() {
	        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "Sample Address");
	        assertEquals("Doe", contact.getLastName());
	    }

	    @Test
	    public void testPhone() {
	        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "Sample Address");
	        assertEquals("1234567890", contact.getPhone());
	    }

	    @Test
	    public void testAddress() {
	        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "Sample Address");
	        assertEquals("Sample Address", contact.getAddress());
	    }
}
