class Solution {
    public int minAddToMakeValid(String s) {
        // Stack<Character> st=new Stack<>();
        // for(char c:s.toCharArray()){
        //     if(c==')'){
        //         if(!st.isEmpty()){
        //             if(st.peek()=='(') st.pop();
        //             else st.push(c);
        //         }
        //         else st.push(c);
        //     }
        //     else st.push(c);
        // }
        // return st.size();
       int open=0,close=0;
        for(char c:s.toCharArray()){
            if(c=='(') open++;
            else{
                if(open<=0) close++;
                else open--;
            }
        }
        return open+close;
    }
}