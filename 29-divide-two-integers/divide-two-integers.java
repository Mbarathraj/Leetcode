class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend <0 && divisor <0)
           return (int)(dividend/divisor) == -2147483648 ? 2147483647:(int)(dividend/divisor);   
        return (int)(dividend/divisor);
    }
}