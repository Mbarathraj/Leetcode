class Solution {
    public int subarraySum(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            if(sum==k) {
                c++; 
            }
            for(int j=i+1;j<nums.length;j++){
                if(sum+nums[j]==k) {
                    c++;
                }
                sum+=nums[j];
            }
        }
        return c;
    }
}