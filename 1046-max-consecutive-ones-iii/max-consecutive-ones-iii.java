class Solution {
    public int longestOnes(int[] nums, int k) {
        int st = 0, end = 0, zC = 0;
        int max = 0;

        while (end < nums.length) {
            // Expand the window by including the end element
            if (nums[end] == 0) {
                zC++;
            }

            // If there are more than k zeros, shrink the window from the left
            while (zC > k) {
                if (nums[st] == 0) {
                    zC--;
                }
                st++;
            }

            // Calculate the length of the current window
            max = Math.max(max, end - st + 1);

            // Move the end pointer to the right
            end++;
        }

        return max;
    }
}
