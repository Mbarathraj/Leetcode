class Solution {
    public String defangIPaddr(String address) {
        String str="";
        for(char c:address.toCharArray()){
            if(c=='.') str+="[.]";
            else str+=c;
        }
        return str;
        
    }
}