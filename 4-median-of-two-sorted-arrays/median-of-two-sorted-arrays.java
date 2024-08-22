class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
        int []arr=new int[n1.length+n2.length];
        int c=0;
        for(int i:n1){
            arr[c++]=i;
        }
        for(int i:n2){
            arr[c++]=i;
        }
        Arrays.sort(arr);
        if(arr.length%2!=0) return arr[arr.length/2];
        int f=(arr.length/2);
        int l=(arr.length/2)-1;
        System.out.print(f+" "+l);
        return (double)(arr[f]+arr[l])/2;

    }
}