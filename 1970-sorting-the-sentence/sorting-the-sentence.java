class Solution {
    public String sortSentence(String s) {
        String str="";
        HashMap<Integer,String> map=new HashMap<>();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                map.put(c-'0',str);
                str="";
            }
            else{
                if(c!=' ')
                    str+=c;
            }
        }
       str="";
       for(int i=1;i<=map.size();i++){
          str+=map.get(i)+" ";
       }
        return str.trim();
    }
}