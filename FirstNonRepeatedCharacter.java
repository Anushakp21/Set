package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static Character findFirstNonRepeatedCharacter(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String input = "swiss";
        Character firstNonRepeated = findFirstNonRepeatedCharacter(input);

        if (firstNonRepeated != null) {
            System.out.println("First non-repeated character: " + firstNonRepeated);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}

