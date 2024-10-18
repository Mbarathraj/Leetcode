class Solution {
    int c = 0;

    public void subset(int pos, int a[], int cal, int max) {
        // Base case: If we have processed all elements
        if (pos == a.length) {
            // Check if the calculated OR equals the maximum OR
            if (cal == max) {
                c++;
            }
            return;
        }

        // Include current element in the OR calculation
        subset(pos + 1, a, cal | a[pos], max);

        // Exclude current element from the OR calculation
        subset(pos + 1, a, cal, max);
    }

    public int countMaxOrSubsets(int[] nums) {
        int max = 0;
        // Calculate the maximum OR possible from all elements
        for (int i : nums) {
            max = max | i;
        }
        // Start the recursive subset calculation
        subset(0, nums, 0, max);
        return c;
    }
}
