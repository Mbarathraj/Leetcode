class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] remainderCount = new int[k];

        // Count occurrences of each remainder
        for (int num : arr) {
            int remainder = ((num % k) + k) % k; // Ensure positive remainder
            remainderCount[remainder]++;
        }

        // Check for pairs
        for (int i = 1; i < (k + 1) / 2; i++) {
            if (remainderCount[i] != remainderCount[k - i]) {
                return false; // Mismatch in pairs
            }
        }

        // Check for the special case of remainder 0
        if (remainderCount[0] % 2 != 0) {
            return false; // Must be even
        }

        // Check for the special case of k being even
        if (k % 2 == 0 && remainderCount[k / 2] % 2 != 0) {
            return false; // Must be even
        }

        return true; // All conditions satisfied
    }
}
