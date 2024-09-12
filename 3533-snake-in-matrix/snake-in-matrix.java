class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int pos=0;
        for(String command:commands){
            if(command.equals("DOWN")) pos+=n;
            else if(command.equals("UP")) pos-=n;
            else if(command.equals("RIGHT")) pos+=1;
            else pos-=1;    
        } 
        return pos;
    }
}