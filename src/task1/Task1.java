package task1;

import java.util.List;

public class Task1 {

    public static int countOccurrance(List<String> list, String target) {
        int count = 0;

        for (String word : list) {
            if (word.equals(target)){
                count++;
            }
        }

        return count;
    }

}
