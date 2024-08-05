class Solution {
    public String replaceDigits(String s) {
        StringBuilder str=new StringBuilder();
        char pre='0';
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                int n=c-'0';
                n=n+pre;
                str.append((char)n);
            }
            else str.append(c);
            pre=c;
        }
        return str.toString();
    }
}