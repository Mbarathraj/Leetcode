class Solution {
    String find(String str){
        HashMap<Character,Integer> map=new LinkedHashMap<>();
        if(str.length()==1) return "11";
        if(str.length()==2 && str.equals("11")) return "21";
        map.put(str.charAt(0),1);
        StringBuilder st=new StringBuilder();
        for(int i=1;i<str.length();i++){
            if(!map.containsKey(str.charAt(i))){
                st.append(map.get(str.charAt(i-1)));
                st.append(str.charAt(i-1));
                map.remove(str.charAt(i-1));
                map.put(str.charAt(i),1);
            }
            else{
                 map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
            }
        }
        st.append(map.get(str.charAt(str.length()-1)));
        st.append(str.charAt(str.length()-1));
        return st.toString();
    }
    public String countAndSay(int n) {
        String str="1";
        for(int i=2;i<=n;i++){
            str=find(str);
        }
        return str;
    }
}