class Solution {
    public int numberOfMatches(int n) {
        int sum=0;
        while(n>1){
            int div=n/2;
            sum+=div;
            n-=div;
        }
        return sum;
    }
}