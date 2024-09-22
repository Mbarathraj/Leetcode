class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<height.length;i++){
            if(height[i]>threshold) if(i+1<height.length) li.add(i+1);
        }
        return li;
    }
}