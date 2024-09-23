class Solution {
    public int balancedStringSplit(String s) {
        int cr=0,cl=0;
        int res=0;
        for(char c:s.toCharArray()){
            if(cr==cl) {
                res++; cr=0;cl=0;
            }
            if(c=='R') cr++;
            else cl++;
        }
        return res;
    }
}