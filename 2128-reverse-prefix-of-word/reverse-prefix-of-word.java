class Solution {
    public String reversePrefix(String word, char ch) {
        int in=word.indexOf(ch);
        StringBuilder st=new StringBuilder(word.substring(0,in+1));
        st.reverse();
        return st.toString()+word.substring(in+1);
        
    }
}