class Solution {
    public long dividePlayers(int[] skill) {
        // Arrays.sort(skill);
        // int i=1,j=skill.length-2;
        // int prev=skill[0]+skill[skill.length-1];
        // long sum=skill[0]*skill[skill.length-1];
        // while(i<j){
        //     if(skill[i]+skill[j]!=prev) return -1;
        //     sum+=skill[i]*skill[j];
        //     i++;
        //     j--;
        // }
        // return sum;
        int a[]=new int[1001];
        int n=skill.length;
        int sum=0;
        for(int s:skill){
            sum+=s;
            a[s]++;
        }
        if(sum%(n/2)!=0) return -1;
        int target=sum/(n/2);
        long res=0;
        for(int s:skill){
            int in=target -s;
            if(a[in]==0) return -1;
            else res+=s*in;
            a[in]--;
        }
        return res/2;
    }
}