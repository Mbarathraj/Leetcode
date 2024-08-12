class Solution {
    public int longestSubarray(int[] nums) {
        int st=0,end=0,zC=0;
        int max = 0; 
        while(end<nums.length){
            if(nums[end]==0) zC++;
            if(zC>=2){
                if(nums[st]==0) zC--;
                st++;
            }
            max=Math.max(max,end-st);
            end++;
        }
        return max;

    }
}