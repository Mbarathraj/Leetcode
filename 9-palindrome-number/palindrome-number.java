class Solution {
    public boolean isPalindrome(int x) {
        String st=""+x;
        int f=0,l=st.length()-1;
        while(f<l){
            if(st.charAt(f)!=st.charAt(l)) return false;
            f++;l--;
        }
        return true;
    }
}