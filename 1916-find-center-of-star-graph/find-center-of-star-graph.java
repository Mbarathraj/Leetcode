class Solution {
    public int findCenter(int[][] edges) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<edges.length;i++){
        //     map.put(edges[i][0],map.getOrDefault(edges[i][0],0)+1);
        //     map.put(edges[i][1],map.getOrDefault(edges[i][1],0)+1);
        // }
        // int ma=0,el=0;
        // for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        //     if(ma<entry.getValue()){
        //         ma=entry.getValue();
        //         el=entry.getKey();
        //     }
        // }
        // return el;
        if(edges[0][0]==edges[1][0]||edges[0][0]==edges[1][1])
            return edges[0][0];
        else
            return edges[0][1];
    }
}