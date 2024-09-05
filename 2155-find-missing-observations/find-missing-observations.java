class Solution {

    public int[] missingRolls(int[] rolls, int mean, int n) {
        int numExistingRolls = rolls.length;
        int totalRolls = numExistingRolls + n;
        int totalSum = totalRolls * mean;
        int sumExistingRolls = 0;
        
        for (int roll : rolls) {
            sumExistingRolls += roll;
        }
        
        int targetSum = totalSum - sumExistingRolls;
        
        // Check if targetSum is achievable with n dice (each roll between 1 and 6)
        if (targetSum < n || targetSum > 6 * n) {
            return new int[0]; // Not possible to get targetSum with n dice
        }
        
        int[] result = new int[n];
        int remainingSum = targetSum;
        
        for (int i = 0; i < n; i++) {
            // Assign the maximum value possible to the current dice, but not exceeding the remaining sum
            int value = Math.min(6, remainingSum - (n - i - 1));
            result[i] = value;
            remainingSum -= value;
        }
        return result;
    }
}
