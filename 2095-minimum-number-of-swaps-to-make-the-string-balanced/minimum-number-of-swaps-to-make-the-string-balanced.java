class Solution {
    public int minSwaps(String s) {
        // Stack<Character> st=new Stack<>();
        // for(char c:s.toCharArray()){
        //     if(c=='[') st.push(c);
        //     else{
        //         if(st.isEmpty() || st.peek()==']') st.push(c);
        //         else st.pop();
        //     }
        // }
        // return (st.size()/2+1)/2;
        int open=0,close=0;
        for(char c:s.toCharArray()){
            if(c=='[') open++;
            else{
                if(open<=0) close++;
                else open--;
            }
        }
        return (close+1)/2;
    }
}