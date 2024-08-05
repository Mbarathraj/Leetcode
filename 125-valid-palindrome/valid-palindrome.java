class Solution {
    boolean find(String str){
        int i=0,j=str.length()-1;
        str=str.toLowerCase();
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        String str="";
        for(char c:s.toCharArray()){
            if(Character.isAlphabetic(c) || Character.isDigit(c)) str+=c;
        }
        
        return find(str);
    }
}