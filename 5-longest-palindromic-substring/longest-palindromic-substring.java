class Solution {
    public boolean palin(String str){
        int i=0,j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
    public String longestPalindrome(String str) {
       String max="";
		for(int i=0;i<str.length();i++) {
			for(int j=str.length()-1;j>=i;j--) {
				if(str.charAt(i)==str.charAt(j)) {
				   if(palin(str.substring(i,j+1))) {
				     max=max.length()<str.substring(i, j+1).length()? str.substring(i, j+1):max;  
                     break;
				}
				}
			}
		}

		return max;
    }
}