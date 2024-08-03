class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c1=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:stones.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.print(map);
        for(char c:jewels.toCharArray()){
            if(map.containsKey(c))
            {   int c2=map.get(c);
                c1+=c2;
            }
        }
        return c1;
    }
}