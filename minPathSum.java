class Solution {
    public int minPathSum(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        
        if (r == 0) return 0;
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                //calculating the total in row
                if (i == 0 && j != 0) {
                    grid[i][j] += grid[i][j-1];
                }
                //calculating the total in col
                else if (i != 0 && j == 0) {
                    grid[i][j] += grid[i-1][j];
                }
                else if (i != 0 && j != 0){
                    grid[i][j] += Math.min(grid[i][j-1], grid[i-1][j]);
                }
            }
        }
        return grid[r-1][c-1];
    }
}