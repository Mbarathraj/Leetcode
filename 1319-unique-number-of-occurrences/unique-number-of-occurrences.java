import java.util.Collection;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }
        Collection<Integer> collectionOfFreqs = frequencyMap.values();

        Set<Integer> setOfFrequencies = new HashSet<>(collectionOfFreqs);

        return (setOfFrequencies.size()==collectionOfFreqs.size());
    }
}