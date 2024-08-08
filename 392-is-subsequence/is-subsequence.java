class Solution {
    public boolean isSubsequence(String s, String t) {
       int i=0;
        for(char c:t.toCharArray()){
            if(i>=s.length()) return true;
            if(c==s.charAt(i)) i++;
        }
        return i==s.length();
    }
}