package phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private List<Record> recordsList;

    public PhoneBook() {
        recordsList = new ArrayList<>();
    }

    public void add(Record record) {
        recordsList.add(record);
    }

    public Record find(String name) {
        for (Record record : recordsList) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record record : recordsList) {
            if (record.getName().equals(name)) {
                foundRecords.add(record);
            }
        }
        return foundRecords.isEmpty() ? null : foundRecords;
    }

}
