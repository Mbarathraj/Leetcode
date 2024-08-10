class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        int sum=0;
        for(int r=0;r<k;r++){
            sum+=nums[r];
        }
        int max=sum;
        for(int r=k;r<nums.length;r++){
            sum+=nums[r]-nums[l];
            max=Math.max(sum,max);
            l++;
        }
        return (double)max/k;
    }
}