class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f=0,t=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) f++;
            else if(bills[i]==10 && f>0){
                t++;
                f--;
            } 
            else if(bills[i]==20){
                if(t > 0){
                    if(f>0){
                        t--;
                        f--;
                    }
                    else return false;
                }
                else if(f>2) f-=3;
                else return false;
            }
            else return false;
        }
        return true;
    }
}