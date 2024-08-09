class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res="";
        int i=0;
        for(i=0;i<word1.length();i++){
            res+=word1.charAt(i);
            if(i<word2.length()) res+=word2.charAt(i);
        }
        if(i<word2.length()) res+=word2.substring(i);
        return res;

    }
}