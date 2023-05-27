package task4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task4 {

    public static void calcOccurance(List<String> list) {
        Set<String> uniqueWords = new HashSet<>(list);

        for (String word : uniqueWords) {
            int occurrence = countOccurrance(list, word);
            System.out.println(word + ": " + occurrence);
        }
    }

    public static int countOccurrance(List<String> list, String target) {
        int count = 0;

        for (String word : list) {
            if (word.equals(target)) {
                count++;
            }
        }

        return count;
    }

}
