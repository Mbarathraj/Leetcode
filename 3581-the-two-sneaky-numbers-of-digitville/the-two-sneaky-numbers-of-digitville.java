class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int a[]=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]) c++;
            }
            if(c==2){
                if(k==0) a[k++]=nums[i];
                else if(a[k-1]!=nums[i]) a[k++]=nums[i];
            } 
            if(k==2) return a;
        }
        return new int[0];
    }
}