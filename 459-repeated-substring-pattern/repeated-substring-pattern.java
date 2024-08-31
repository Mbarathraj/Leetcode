class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i=0;i<s.length()/2;i++){
            String s1=s.substring(0,i+1);
            int c=0;
            for(int j=i+1;j<s.length();j+=s1.length()){
                if(j+s1.length()<=s.length()){
                 if(s.substring(j,j+s1.length()).equals(s1)) c++;
                 else break;
                }
            }
            if(s.length()/s1.length()==c+1 && c!=0 && s.length()%s1.length()==0) return true;
        }
        return false;
    }
}