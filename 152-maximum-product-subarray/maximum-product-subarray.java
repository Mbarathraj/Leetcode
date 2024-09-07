class Solution {
    public int maxProduct(int[] nums) {
        int ma=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            ma=Math.max(ma,sum);
            for(int j=i+1;j<nums.length;j++){
                sum*=nums[j];
                ma=Math.max(ma,sum);
            }
            ma=Math.max(ma,sum);
        }
        return ma;
    }
}