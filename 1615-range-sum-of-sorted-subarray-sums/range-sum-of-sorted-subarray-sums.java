import java.util.ArrayList;
import java.util.Collections;

class Solution {
    private static final int MOD = 1000000007;

    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> subarraySums = new ArrayList<>();
        
        // Generate all subarray sums
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = (sum + nums[j]) % MOD;
                subarraySums.add(sum);
            }
        }
        
        // Sort all subarray sums
        Collections.sort(subarraySums);
        
        // Calculate the range sum
        long rangeSum = 0;
        for (int i = left - 1; i < right; i++) {
            rangeSum = (rangeSum + subarraySums.get(i)) % MOD;
        }
        
        return (int) rangeSum;
    }
}
