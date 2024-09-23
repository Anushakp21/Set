package map;

import java.util.*;

public class Intersection {
    public static List<Integer> intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (countMap.containsKey(num) && countMap.get(num) > 0) {
                result.add(num);
                countMap.put(num, countMap.get(num) - 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        List<Integer> intersection = intersection(nums1, nums2);
        System.out.println("Intersection of two arrays: " + intersection);
    }
}

