class Solution {
    public boolean isSubsequence(String s, String t) {
        int prev=-1;
        for(char c:s.toCharArray()){
            if(t.indexOf(c)==-1) return false;
            t=t.substring(t.indexOf(c)+1);
        }
        return true;
    }
}