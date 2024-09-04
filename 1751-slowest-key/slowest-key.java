class Solution {
    public char slowestKey(int[] rT, String key) {
        char c=key.charAt(0);
        int ma=rT[0];
        for(int i=1;i<rT.length;i++){
           if(ma<rT[i]-rT[i-1]){
                ma=rT[i]-rT[i-1];
                c=key.charAt(i);
           }
           else if(ma==rT[i]-rT[i-1]){
                ma=rT[i]-rT[i-1];
                 if(c<key.charAt(i)){
                    c=key.charAt(i);
                 }
           }
        }
    return c;
    }
}