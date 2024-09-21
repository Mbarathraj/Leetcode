class Solution {
    public String interpret(String command) {
        StringBuilder st=new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                st.append("o");
            }
            else if(command.charAt(i)!=')' && command.charAt(i)!='(') st.append(command.charAt(i));
        }
        return st.toString();
    }
}