class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] prefixSum = new int[n];  
        // Compute prefix sums
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        
        // Calculate result for each position
        for (int i = 0; i < n; i++) {
            // Sum of absolute differences
            int sumLeft = (i > 0) ? i * nums[i] - prefixSum[i - 1] : 0;
            int sumRight = (i < n - 1) ? (prefixSum[n - 1] - prefixSum[i]) - (n - i - 1) * nums[i] : 0;
            result[i] = sumLeft + sumRight;
        }
        
        return result;
    }
}
