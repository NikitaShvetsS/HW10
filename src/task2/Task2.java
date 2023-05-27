package task2;


import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();

        for (int num : array) {
            list.add(num);
        }

        return list;
    }

}
