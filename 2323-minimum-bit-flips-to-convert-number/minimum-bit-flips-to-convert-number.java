class Solution {
    public int minBitFlips(int start, int goal) {
        int num=start^goal;
        int count=0;
        // for(char c:Integer.toString(num,2).toCharArray()){
        //     if(c=='1') count++;
        // }
        while(num>0){
            num=num & (num-1);
            count++;
        }
        return count;
    }
}