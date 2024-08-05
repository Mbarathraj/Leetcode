class Solution {
    boolean find(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String st:words){
            if(st.charAt(0)==st.charAt(st.length()-1)){
                if(find(st)) return st;
            }
        }
        return "";
    }
}