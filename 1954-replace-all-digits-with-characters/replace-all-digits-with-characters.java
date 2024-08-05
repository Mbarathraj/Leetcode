class Solution {
    public String replaceDigits(String s) {
        String str="";
        char pre='0';
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                int n=c-'0';
                n=n+pre;
                str+=(char)n;
            }
            else str+=c;
            pre=c;
        }
        return str;
    }
}