class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty()){
                String s1=""+st.peek()+s.charAt(i);
                if(s1.equals("AB") || s1.equals("CD")) st.pop();
                else st.push(s.charAt(i));

            }
            else st.push(s.charAt(i));
        }
        return st.size();
    }
}
