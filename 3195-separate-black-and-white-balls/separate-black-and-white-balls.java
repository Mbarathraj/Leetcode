class Solution {
    public long minimumSteps(String s) {
        long c=0,res=0;
        for(char c1:s.toCharArray()){
            if(c1=='1') c++;
            else if(c1=='0' && c>=1){
                res+=c;
            }
        }
        return res;
    }
}