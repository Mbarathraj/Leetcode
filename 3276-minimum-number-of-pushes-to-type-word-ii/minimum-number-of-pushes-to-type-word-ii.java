class Solution {
    public int minimumPushes(String word) {
       HashMap<Character,Integer> map=new HashMap<>();
       HashSet<Character> set=new LinkedHashSet<>();
       ArrayList<Integer> al=new ArrayList<>();
       for(char c:word.toCharArray()){
          map.put(c,map.getOrDefault(c,0)+1);
          set.add(c);
       }
       int sum=0;
       if(set.size()<=8){
        for(char c:set){
            sum+=1*map.get(c);
        }
       }
       else{
        for(char c:set){
            al.add(map.get(c));
        }
        Collections.sort(al);
        Collections.reverse(al);
        int t=8,t1=1;
        for(int i=0;i<al.size();i++){
            if(i>=t){
                t1++;
                sum+=t1*al.get(i);
                t=t+8;
            }
            else sum+=t1*al.get(i);
        }
       }
       return sum;
    }
}