class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n-k+1];

        for(int i=0;i<n-k+1;i++){
            boolean sorted = true;
            int max = nums[i];

            for(int j=i;j<i+k-1;j++){
                if (nums[j]+1!=nums[j+1]) {
                    sorted = false;
                    break;
                }
                max = Math.max(max, nums[j + 1]);
            }

            if(sorted) ans[i] = max;
            else ans[i] = -1;
        }
        return ans;
    }
}