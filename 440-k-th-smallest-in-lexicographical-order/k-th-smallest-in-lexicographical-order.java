class Solution {
    public int findKthNumber(int n, int k) {
        int currentNumber = 1;
        k -= 1;
        while(k > 0){
            int steps = compute(n,currentNumber,currentNumber+1);
            if(steps <= k){
                currentNumber += 1;
                k -= steps;
            }
            else {
                currentNumber *= 10;
                k -= 1;
            }
        }
        return currentNumber;
    }
    public int compute(int n , long current,long next){
        int steps = 0;
        while( current <= n){
            steps +=  Math.min(n+1,next) - current;
            current *= 10;
            next *= 10;
        }
        return steps;
    }
}