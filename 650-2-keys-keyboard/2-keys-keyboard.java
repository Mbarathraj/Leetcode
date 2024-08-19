class Solution {
    public int minSteps(int n) {
        if(n==1) return 0;
        return 1+helper(1,1,n);
    }
    public int helper(int count,int paste,int n){
        if(count==n) return 0;
        if(count > n) return 1000;
        int res1=1+helper(count+paste,paste,n);
        int res2=2+helper(count+count,count,n);
        return Math.min(res1,res2);
    }
}