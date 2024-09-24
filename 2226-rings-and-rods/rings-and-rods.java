class Solution {
    public int countPoints(String rings) {
        int c=0;
        for(int i=0;i<=9;i++){
            boolean g=false,r=false,b=false;
            for(int j=1;j<rings.length();j+=2){
                if(rings.charAt(j)-'0'==i){
                    if(rings.charAt(j-1)=='B') b=true;
                    else if(rings.charAt(j-1)=='G') g=true;
                    else if(rings.charAt(j-1)=='R') r=true;
                }
            }
            if(r && g && b) c++;
        }
        return c;
    }
}