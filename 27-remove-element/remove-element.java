class Solution {
    public int removeElement(int[] nums, int val) {
        int arr[]=new int[nums.length];
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val)
                arr[c++]=nums[i];
        }
        System.out.print(Arrays.toString(arr));
        System.arraycopy(arr,0,nums,0,c);
        return c;
    }
}