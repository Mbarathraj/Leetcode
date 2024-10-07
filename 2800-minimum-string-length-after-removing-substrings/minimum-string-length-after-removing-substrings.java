class Solution {
    public int minLength(String s) {
        // Stack<Character> st=new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     if(!st.isEmpty()){
        //         String s1=""+st.peek()+s.charAt(i);
        //         if(s1.equals("AB") || s1.equals("CD")) st.pop();
        //         else st.push(s.charAt(i));

        //     }
        //     else st.push(s.charAt(i));
        // }
        // return st.size();
        char a[]=new char[s.length()+1];
        int last=-1;
        for(char c:s.toCharArray()){
            if(last > -1 &&  (c=='B' && a[last]=='A' ||  c=='D' && a[last]=='C')) last--;
            else{
                 last++;
                 a[last]=c;
            }
        }
        return last+1;
    }
}
