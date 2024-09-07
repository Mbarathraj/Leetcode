class Solution {
    public int mySqrt(int a) {
        // return (int)Math.sqrt(x);
        if(a<2) return a;
        int low=2,high=a/2;
        while(low<=high){
            int mid=(low+high)/2;
            if((long)mid*mid==a) return mid;
            else if((long)mid*mid<a){
                low=mid+1;
            }
            else high=mid-1;
        }
        return high;
    }
}