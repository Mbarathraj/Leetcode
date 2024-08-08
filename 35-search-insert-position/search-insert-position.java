class Solution {
    public int find(int[] nums,int tar,int f,int l){
        if(f>l) return f;
        int mid=(f+l)/2;
        if(nums[mid]==tar) return mid;
        if(nums[mid]<tar) return find(nums,tar,mid+1,l);
        return find(nums,tar,f,mid-1);
    }
    public int searchInsert(int[] nums, int target) {
        return find(nums,target,0,nums.length-1);
    }
}