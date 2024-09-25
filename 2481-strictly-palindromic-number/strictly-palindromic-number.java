class Solution {
    boolean check(String st){
        int i=0,j=st.length()-1;
        while(i<j){
            if(st.charAt(i)!=st.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<= n-2;i++){
            String st=Integer.toString(n,i);
            if(!check(st)) return false; 
        }
        return true;
    }
}