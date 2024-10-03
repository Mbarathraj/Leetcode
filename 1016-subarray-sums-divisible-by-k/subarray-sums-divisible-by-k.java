import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> modCount = new HashMap<>();
        modCount.put(0, 1); // To account for subarrays that are themselves divisible by k
        
        int cumulativeSum = 0;
        int count = 0;

        for (int num : nums) {
            cumulativeSum += num;
            int mod = ((cumulativeSum % k) + k) % k; // Handle negative mod values
            
            // If this mod has been seen before, it means there are some subarrays
            // that sum to a multiple of k.
            count += modCount.getOrDefault(mod, 0);
            
            // Update the count of this mod in the map
            modCount.put(mod, modCount.getOrDefault(mod, 0) + 1);
        }

        return count;
    }
}
