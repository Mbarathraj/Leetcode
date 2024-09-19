class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        ArrayList<Integer> [][]dp=new ArrayList[expression.length()][expression.length()];
        return find(expression,0,expression.length()-1,dp);
    }
    public List<Integer> find(String exp, int st,int en,List<Integer> [][]dp){
        List<Integer> res=new ArrayList<>();
        if(dp[st][en]!=null) return dp[st][en];
        if(st==en) {
            res.add(exp.charAt(st)-'0');
            return res;
        }
        if(en-st==1 && Character.isDigit(exp.charAt(st))){
            res.add(Integer.parseInt(exp.substring(st,en+1)));
            return res;
        }
        for(int k=st;k<=en;k++){
            if(Character.isDigit(exp.charAt(k))) continue;
            else{
                char op=exp.charAt(k);
                List<Integer> left=find(exp,st,k-1,dp);
                List<Integer> right=find(exp,k+1,en,dp);
                for(int i:left){
                    for(int j:right){
                        if(op=='+'){
                            res.add(i+j);
                        }
                        else if(op=='*'){
                            res.add(i*j);
                        }
                        else{
                            res.add(i-j);
                        }
                    }
                }
            } 
    
        }
        dp[st][en]=res;
            return res;
    }
}