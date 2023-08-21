
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

    @Test
    void testContact()
    {
        Contact contact = new Contact("123", "Jill", "Smith", "0123456789", "1 main st");
        assertEquals("123", contact.getID());
        assertEquals("Jill", contact.getFirstName());
        assertEquals("Smith", contact.getLastName());
        assertEquals("0123456789", contact.getPhone());
        assertEquals("1 main st", contact.getAddress());
    }

    @Test
    void IDLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("01234567890", "Jill", "Smith", "0123456789", "1 main st");
        });
    }

    @Test
    void idNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Jill", "Smith", "0123456789", "1 main st");
        });
    }

    @Test
    void fistNameLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "JillJillJill", "Smith", "0123456789", "1 main st");
        });
    }

    @Test
    void firstNameNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", null, "Smith", "0123456789", "1 main st");
        });
    }

    @Test
    void lastNameLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "Jill", "SmithSmithSmith", "0123456789", "1 main st");
        });
    }

    @Test
    void lastNameNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "Jill", null, "0123456789", "1 main st");
        });
    }

    @Test
    void phoneLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "Jill", "Smith", "01234567890", "1 main st");
        });
    }

    @Test
    void phoneNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "Jill", "Smith", null, "1 main st");
        });
    }

    @Test
    void addressLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "Jill", "Smith", "01234567890", "111 abcdefghijklmnopqrstuvwxyz st");
        });
    }

    @Test
    void addressNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "Jill", "Smith", "01234567890", null);
        });
    }
}