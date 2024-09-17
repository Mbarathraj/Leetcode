class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map=new HashMap<>();
        for(String st:s1.split(" ")){
             map.put(st,map.getOrDefault(st,0)+1);
        }
        for(String st:s2.split(" ")){
             map.put(st,map.getOrDefault(st,0)+1);
        }
        ArrayList<String> li=new ArrayList<>();
         for(String word:map.keySet()){
            if(map.get(word)==1) li.add(word);
         }
         return li.toArray(new String[0]);
       
    }
}