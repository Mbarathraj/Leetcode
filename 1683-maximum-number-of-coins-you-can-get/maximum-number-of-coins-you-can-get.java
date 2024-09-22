class Solution {
    public int maxCoins(int[] piles) {
        //  Arrays.sort(piles);
        //  int sum=0,curIn=piles.length-2;
        //  for(int i=1;i<=piles.length/3;i++){
        //     sum+=piles[curIn];
        //     curIn-=2;
        //  }
        //  return sum;
        int a[]=new int[100000];
        for(int i:piles){
            a[i]++;
        }
        int chance=piles.length/3;
        int in=a.length-2,sum=0,t=1;
        while(chance>0){
            if(a[in]>0){
                if(t==1) t=0;
                else{
                    sum+=in;
                    chance--;
                    t=1;
                }
                a[in]--;
            }
            else in--;
        }
        return sum;
    }
    
}