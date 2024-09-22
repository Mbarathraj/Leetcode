class Solution {
    public boolean reportSpam(String[] message, String[] bw) {
        int c=0;
        Set<String> set=new HashSet<>();
        for(String st:bw){
            set.add(st);
        }
            for(int j=0;j<message.length;j++){
                if(set.contains(message[j])){ 
                 c++;
                  if(c>=2) return true;
                }
            }
        
        return false;
    }
}