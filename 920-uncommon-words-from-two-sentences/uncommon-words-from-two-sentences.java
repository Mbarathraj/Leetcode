class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String ,Integer> map=new HashMap<>();
        for(String str:s1.split(" ")){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(String str:s2.split(" ")){
            map.put(str,map.getOrDefault(str,0)+1);
        }
         Set<String> keys = map.keySet();
         int c=0;
        for(String st:keys){
            if(map.get(st)==1){
                c++;
            }
        }
        String arr[]=new String[c];
        c=0;
        for(String st:keys){
            if(map.get(st)==1){
                arr[c++]=st;
            }
        }
        return arr;
    }
}