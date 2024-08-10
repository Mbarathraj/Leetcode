class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length < k) {
            throw new IllegalArgumentException("Array length is less than the subarray length k");
        }

        double maxAverage = Double.NEGATIVE_INFINITY;
        int start = 0, end = 0;
        int sum = 0;

        while (end < nums.length) {
            sum += nums[end];
            end++;
            // Check if the window size is exactly k
            if (end - start == k) {
                maxAverage = Math.max(maxAverage, (double) sum / k);
                sum -= nums[start];
                start++;
            }
        }
        return maxAverage;
    }
}
