class Solution {
    public boolean isPowerOfTwo(int n) {
    //     if(n==0 || n<0) return false;
    //    while(n>0){
    //       if(n%2!=0 && n>1) return false;
    //       n/=2;
    //    }
    //    return true;
       if(n<=0) return false;
       if(n==1) return true;
       return n%2==0 && isPowerOfTwo(n/2);
    }
}