package map;

import java.util.*;

public class SortMap {
    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("apple", 5);
        unsortedMap.put("banana", 2);
        unsortedMap.put("orange", 8);
        unsortedMap.put("mango", 1);

        Map<String, Integer> sortedMap = sortByValue(unsortedMap);

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

