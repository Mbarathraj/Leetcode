class Solution {
    public String longestCommonPrefix(String[] strs) {
        int a[]=new int[26];
        String min=strs[0];
        for(int i=1;i<strs.length;i++){
            min=min.length()>strs[i].length() ? strs[i]:min;
        }
        StringBuilder st=new StringBuilder();
        for(int i=0;i<min.length();i++){
           int c=0;
           for(int j=0;j<strs.length;j++){
             if(strs[j].charAt(i)!=min.charAt(i)) return st.toString();
             else c++;
           }
           if(c==strs.length) st.append(min.charAt(i));
        }
        return st.toString();
    }
}