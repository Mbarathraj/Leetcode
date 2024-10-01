class Solution {
    public int xorOperation(int n, int start) {
        int res=start,c=1;
        for(int i=start+1;i<start+n;i++){
            res^=start+2*c;
            c++;
        }
        return res;
    }
}