package map;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private TreeMap<String, String> phoneBook;

    PhoneBook() {
        phoneBook = new TreeMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
        System.out.println(name + " added to the phone book.");
    }

    public void removeContact(String name) {
        if (phoneBook.remove(name) != null) {
            System.out.println(name + " removed from the phone book.");
        } else {
            System.out.println(name + " not found in the phone book.");
        }
    }

    public String searchContact(String name) {
        if (phoneBook.containsKey(name)) {
            return "Contact found: " + name + " -> " + phoneBook.get(name);
        } else {
            return name + " not found in the phone book.";
        }
    }

    public void displayAllContacts() {
        System.out.println("Phone Book:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Alice", "123-456-7890");
        phoneBook.addContact("Bob", "987-654-3210");

        System.out.println(phoneBook.searchContact("Alice"));

        phoneBook.removeContact("Bob");

        phoneBook.displayAllContacts();
    }
}

