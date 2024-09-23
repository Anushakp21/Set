package map;

import java.util.HashMap;
import java.util.Map;

public class DuplicatedElements {
    public static void findDuplicates(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicate elements and their counts:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 4, 5, 6, 3, 4};
        findDuplicates(arr);
    }
}

