package phonebook;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add(new Record("Jack", "666666666"));
        phoneBook.add(new Record("Alice", "384284932"));
        phoneBook.add(new Record("Jack", "444444444"));

        String nameToFind = "Jack";
        Record foundRecord = phoneBook.find(nameToFind);
        if (foundRecord != null) {
            System.out.println("Found record by name " + nameToFind + ":");
            System.out.println("Name: " + foundRecord.getName());
            System.out.println("Phone: " + foundRecord.getPhoneNumber());
        } else {
            System.out.println("Record by name " + nameToFind + " not found.");
        }

        String nameToFindAll = "Jack";
        List<Record> foundRecords = phoneBook.findAll(nameToFindAll);
        if (foundRecord != null) {
            System.out.println("Found records by name " + nameToFindAll + ":");
            for (Record record : foundRecords) {
                System.out.println("Name: " + record.getName());
                System.out.println("Phone: " + record.getPhoneNumber());
            }
        } else {
            System.out.println("Records by name " + nameToFindAll + " not found.");
        }

    }
}
