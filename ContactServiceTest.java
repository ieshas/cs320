
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    @Test
    public void addContact(){
        ContactService contentService = new ContactService();
        Contact newContact = new Contact("127", "Spongebob", "Bob", "0123456789", "123 rainbow rd");
        assertTrue(contentService.addContact(newContact));
    }

    @Test
    public void deleteContact(){
        ContactService contactService = new ContactService();

        Contact contact1 = new Contact("127", "Spongebob", "Bob", "0123456789", "123 rainbow rd");

        contactService.addContact(contact1);

        assertTrue(contactService.deleteContact("127"));
    }

    @Test
    public void updateContact(){
        ContactService contactService = new ContactService();

        Contact contact1 = new Contact("127", "Spongebob", "Bob", "0123456789", "123 rainbow rd");
        Contact contact2 = new Contact("892", "Patrick", "Star", "9876543210", "124 rainbow rd");

        contactService.addContact(contact1);
        contactService.addContact(contact2);


        assertTrue(contactService.updateContact("127", "Sponge", "Bobby", "0123456789", "90 rainbow rd"));
        assertFalse(contactService.updateContact("390", "Sponge", "Bobby", "0123456789", "90 rainbow rd"));
    }
}