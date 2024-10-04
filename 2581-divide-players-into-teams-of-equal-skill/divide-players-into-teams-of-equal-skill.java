class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i=1,j=skill.length-2;
        int prev=skill[0]+skill[skill.length-1];
        long sum=skill[0]*skill[skill.length-1];
        while(i<j){
            if(skill[i]+skill[j]!=prev) return -1;
            sum+=skill[i]*skill[j];
            i++;
            j--;
        }
        return sum;
    }
}