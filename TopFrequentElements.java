package map;

import java.util.*;

public class TopFrequentElements {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(frequencyMap.entrySet());

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(maxHeap.poll().getKey());
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        List<Integer> topK = topKFrequent(nums, k);
        System.out.println("Top " + k + " frequent elements: " + topK);
    }
}

