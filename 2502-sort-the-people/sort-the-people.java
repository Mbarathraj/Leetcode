class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                if(heights[i]<heights[j]){
                    int t=heights[i];
                    heights[i]=heights[j];
                    heights[j]=t;
                    String name=names[i];
                    names[i]=names[j];
                    names[j]=name;
                }
            }
        }
        return names;
    }
}