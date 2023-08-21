import java.util.ArrayList;

public class ContactService {

    private ArrayList<Contact> contacts;

    public ContactService() {
        contacts = new ArrayList<>();
    }

    // add contact
    public boolean addContact(Contact newContact) {
        boolean exists = false;
        for (Contact cList : contacts) {
            if (cList.getID().equals(newContact.getID())) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            contacts.add(newContact);
            return true;
        } else {
            return false;
        }
    }

    // delete contacts
    public boolean deleteContact(String contactID) {
        for (Contact cList : contacts) {
            if (cList.getID().equals(contactID)) {
                contacts.remove(cList);
                return true;
            }
        }
        return false;
    }

    // update contact
    public boolean updateContact(String contactID, String firstName, String lastName, String phone, String address) {
        for (Contact cList : contacts) {
            if (cList.getID().equals(contactID)) {

                if (!firstName.isEmpty() || !(firstName.length() > 10)) {
                    cList.setFistName(firstName);
                }

                if (!lastName.isEmpty() || !(lastName.length() > 10)) {
                    cList.setLastName(firstName);
                }

                if (!phone.isEmpty() && (phone.length() == 10)) {
                    cList.setPhone(phone);
                }

                if (!address.isEmpty() || !(address.length() == 30)) {
                    cList.setAddress(address);
                }
                return true;
            }
        }
        return false;
    }
}