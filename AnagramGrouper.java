package map;

import java.util.*;

public class AnagramGrouper {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            anagramMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupedAnagrams = groupAnagrams(words);

        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }
}

