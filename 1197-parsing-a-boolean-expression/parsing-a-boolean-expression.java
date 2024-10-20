class Solution {
    public boolean parseBoolExpr(String exp) {
        Stack<Character> st=new Stack<>();
        boolean res;
        for(char c:exp.toCharArray()){
            if(c==')'){
                ArrayList<Boolean> li=new ArrayList<>();
                while(st.peek()!='('){
                    if(st.peek()=='f') li.add(false);
                    else li.add(true);
                    st.pop();
                }
                st.pop();
                char ope=st.pop();
                if(ope=='!'){
                    st.push(not(li) ? 't':'f');
                }
                else if(ope=='|'){
                    st.push(or(li) ? 't':'f');
                }
                else st.push(and(li) ? 't':'f');
            }
            else {
                if(c!=',')st.push(c);
            }
        }
       return st.peek()=='t' ? true:false;
    }
        boolean not(ArrayList<Boolean> li){
            return !li.get(0);
        }
        boolean or(ArrayList<Boolean> li){
            boolean res=false;
            for(boolean b:li){
                res=res|b;
            }
            return res;
        }
        boolean and(ArrayList<Boolean> li){
            boolean res=true;
            for(boolean b:li){
                res=res&b;
            }
            return res;
        }
    }
