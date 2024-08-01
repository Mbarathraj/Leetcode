class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []temp=new int[nums.length];
        int k=0;
        for(int i=0;i<n;i++){
            temp[k++]=nums[i];
            temp[k++]=nums[i+n];
        }
        return temp;
    }
}