class Solution {
    int a[]=new int[2];
    int c=0;
    public int find(int []nums,int tar,boolean isLeft){
       int f=0,l=nums.length-1;
       int in=-1;
       while(f<=l){
        int mid=(f+l)/2;
        if(nums[mid]==tar){
            in=mid;
            if(isLeft) l=mid-1;
            else f=mid+1;
        }
        else if(nums[mid]<tar) f=mid+1;
        else if(nums[mid]>tar) l=mid-1;
       }
       return in;
    }
    public int[] searchRange(int[] nums, int target) {
        a[0]=find(nums,target,true);
        a[1]=find(nums,target,false);
        return a;
    }
}