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
        for(String st:s1.split(" ")){
             if(map.get(st)==1) li.add(st);
        }
        for(String st:s2.split(" ")){
             if(map.get(st)==1) li.add(st);
        }
        String []arr=new String[li.size()];
        int c=0;
        for(String st:li){
            arr[c++]=st;
        }
        return arr;
    }
}