class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String str[]=(s1+" "+s2).split(" ");
        HashMap<String, Integer> map=new HashMap<>();
        for(String st:str){
             map.put(st,map.getOrDefault(st,0)+1);
        }
        ArrayList<String> li=new ArrayList<>();
        for(String st:str){
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