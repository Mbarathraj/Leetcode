import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // HashMap to store the element and its most recent index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // Check if the element has been seen before
            if (map.containsKey(nums[i])) {
                // Check if the previous index is within the range k
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            // Update the element's most recent index
            map.put(nums[i], i);
        }

        return false;
    }
}
