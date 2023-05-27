package task3;

import java.util.ArrayList;
import java.util.List;


public class Task3 {

    public static List<Integer> findUnique(List<Integer> list) {
        List<Integer> uniqueList = new ArrayList<>();

        for (Integer num : list) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        return uniqueList;
    }

}
