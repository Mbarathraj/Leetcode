class Solution {
    public String decodeMessage(String key, String message) {
        String str="abcdefghijklmnopqrstuvwxyz";
        String res="";
        key=key.replace(" ","");
        HashSet<Character> set=new LinkedHashSet<>();
        for(char c:key.toCharArray()){
            set.add(c);
        }
        key="";
        for(char c:set){
            key+=c;
        }
        for(char c:message.toCharArray()){
            if(Character.isSpace(c)){
                res+=" ";
            }
            else {
                res+=str.charAt((key.indexOf(c)));
            }
        }
        return res;
    }
}