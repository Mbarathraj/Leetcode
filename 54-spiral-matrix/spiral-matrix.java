import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> li = new ArrayList<>();
        
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return li; // Handle empty matrix cases
        }

        int tr = 0, br = mat.length - 1;
        int lc = 0, rc = mat[0].length - 1;

        while (tr <= br && lc <= rc) {
            // Traverse from left to right along the top row
            for (int col = lc; col <= rc; col++) {
                li.add(mat[tr][col]);
            }
            tr++; // Move down to the next row
            
            // Traverse from top to bottom along the right column
            for (int row = tr; row <= br; row++) {
                li.add(mat[row][rc]);
            }
            rc--; // Move left to the next column
            
            if (tr <= br) {
                // Traverse from right to left along the bottom row
                for (int col = rc; col >= lc; col--) {
                    li.add(mat[br][col]);
                }
                br--; // Move up to the previous row
            }
            
            if (lc <= rc) {
                // Traverse from bottom to top along the left column
                for (int row = br; row >= tr; row--) {
                    li.add(mat[row][lc]);
                }
                lc++; // Move right to the next column
            }
        }

        return li;
    }
}
