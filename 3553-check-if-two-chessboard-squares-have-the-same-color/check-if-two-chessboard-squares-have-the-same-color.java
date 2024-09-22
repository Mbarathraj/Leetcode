class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        // Determine the color of the square for c1
        boolean color1 = ((c1.charAt(0) - 'a') + (c1.charAt(1) - '1')) % 2 == 0;
        
        // Determine the color of the square for c2
        boolean color2 = ((c2.charAt(0) - 'a') + (c2.charAt(1) - '1')) % 2 == 0;

        // Return true if both colors are the same
        return color1 == color2;
    }
}

