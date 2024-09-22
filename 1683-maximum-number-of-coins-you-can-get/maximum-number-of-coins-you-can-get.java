class Solution {
    public int maxCoins(int[] piles) {
         Arrays.sort(piles);
         int sum=0,curIn=piles.length-2;
         for(int i=1;i<=piles.length/3;i++){
            sum+=piles[curIn];
            curIn-=2;
         }
         return sum;
    }
    
}