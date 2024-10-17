class Solution {
    public int maximumSwap(int num) {
        String str=""+num;
        char a[]=str.toCharArray();
        for(int i=0;i<a.length;i++){
            char max=a[i];
            int pos=i;
            for(int j=i+1;j<a.length;j++){
                if(max<=a[j] && a[i]!=a[j]){
                    max=a[j];
                    pos=j;
                }
            }
            if(pos!=i){
                char c=a[i];
                a[i]=a[pos];
                a[pos]=c;
                break;
            }
        }
            return Integer.parseInt(new String(a));
    }
}