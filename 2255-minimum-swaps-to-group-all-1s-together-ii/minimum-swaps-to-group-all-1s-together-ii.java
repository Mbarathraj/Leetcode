class Solution {
    public int minSwaps(int[] nums) {
    int noOne = 0;
    for (int i : nums) {
        if (i == 1) noOne++;
    }

    int oneWin = 0;
    int c = 0;
    int n = nums.length;
    
    // Compute initial window sum
    for (int i = 0; i < noOne; i++) {
        if (nums[i % n] == 1) c++;
    }
    oneWin = c;

    // Sliding window to find the maximum number of 1s in any window of size 'noOne'
    for (int i = noOne; i < n + noOne; i++) {
        // Slide the window right
        if (nums[i % n] == 1) c++;
        if (nums[(i - noOne) % n] == 1) c--;
        oneWin = Math.max(oneWin, c);
    }

    return noOne - oneWin;


}

}