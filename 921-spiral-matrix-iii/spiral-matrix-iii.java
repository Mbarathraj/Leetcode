class Solution {
        public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[][] dirt = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; 
        List<int[]> res = new ArrayList<>();
        int len = 0, d = 0; 
        res.add(new int[]{r0, c0});
        while (res.size() < R * C) {
            if (d == 0 || d == 2) len++; 
            for (int i = 0; i < len; i++) {
                r0 += dirt[d][0];
                c0 += dirt[d][1];
                if (r0 >= 0 && r0 < R && c0 >= 0 && c0 < C) 
                    res.add(new int[]{r0, c0});
            }
            d = (d + 1) % 4;
        }
        return res.toArray(new int[R * C][2]);
    }
}