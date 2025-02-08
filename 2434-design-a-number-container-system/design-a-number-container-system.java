import java.util.*;

class NumberContainers {
    private Map<Integer, Integer> indexToNumber; // Stores index -> number
    private Map<Integer, TreeSet<Integer>> numberToIndices; // Stores number -> sorted set of indices

    public NumberContainers() {
        indexToNumber = new HashMap<>();
        numberToIndices = new HashMap<>();
    }

    public void change(int index, int number) {
        if (indexToNumber.containsKey(index)) {
            int oldNumber = indexToNumber.get(index);
            if (oldNumber == number) return; // No change needed
            
            // Remove index from the old number's index set
            numberToIndices.get(oldNumber).remove(index);
            if (numberToIndices.get(oldNumber).isEmpty()) {
                numberToIndices.remove(oldNumber);
            }
        }

        // Update the number at the index
        indexToNumber.put(index, number);

        // Store the index in the numberToIndices map
        numberToIndices.putIfAbsent(number, new TreeSet<>());
        numberToIndices.get(number).add(index);
    }

    public int find(int number) {
        return numberToIndices.containsKey(number) ? numberToIndices.get(number).first() : -1;
    }
}

/**
 * Example usage:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index, number);
 * int param_2 = obj.find(number);
 */
