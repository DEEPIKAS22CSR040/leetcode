import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();

        // Step 1: Create a frequency map
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Step 2: Convert the map to a list of entries
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // Step 3: Sort the list by frequency (descending) and then lexicographically (ascending)
        list.sort((entry1, entry2) -> {
            if (entry1.getValue().equals(entry2.getValue())) {
                return entry1.getKey().compareTo(entry2.getKey());  // Lexicographical comparison
            } else {
                return entry2.getValue().compareTo(entry1.getValue());  // Frequency comparison
            }
        });

        // Step 4: Extract the top k words
        for (int i = 0; i < k; i++) {
            result.add(list.get(i).getKey());
        }

        return result;
    }
}
