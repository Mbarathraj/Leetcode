class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set=new HashSet<>();
        for(int i:arr1){
            String st=""+i;
            for(int j=1;j<=st.length();j++){
                set.add(st.substring(0,j));
            }
        }
        int max=0;
        for(int i=0;i<arr2.length;i++){
            String st=""+arr2[i];
            for(int j=1;j<st.length()+1;j++){
                if(set.contains(st.substring(0,j))){
                    max=Math.max(max,j);
                }
            }
        }
        return max;
    }
}