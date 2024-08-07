class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='{' || c=='[')
                st.push(c);
            else 
            if(!st.isEmpty()){
            if(c==')' && st.peek()=='(')
               st.pop();
            else if(c=='}' && st.peek()=='{')
               st.pop();
            else if(c==']' && st.peek()=='[')
               st.pop();
            else return false;
            }
            else return false;
        }
        if(!st.isEmpty()) return false;
        return true;
    }
}