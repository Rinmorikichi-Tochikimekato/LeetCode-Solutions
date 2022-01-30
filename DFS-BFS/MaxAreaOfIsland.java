// 695. Max Area of Island
// Medium

// 5155

// 137

// Add to List

// Share
// You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

// The area of an island is the number of cells with a value 1 in the island.

// Return the maximum area of an island in grid. If there is no island, return 0.

 

// Example 1:


// Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
// Output: 6
// Explanation: The answer is not 11, because the island must be connected 4-directionally.
// Example 2:

// Input: grid = [[0,0,0,0,0,0,0,0]]
// Output: 0
 

// Constraints:

// m == grid.length
// n == grid[i].length
// 1 <= m, n <= 50
// grid[i][j] is either 0 or 1.


class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int[][] dir = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        
        int maxArea = 0;
        int r = grid.length;
        int c = grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j] == 1){
                    grid[i][j] = -1;
                    int area = dfs(grid,i,j,dir,0);
                    maxArea = Math.max(maxArea,area);
                }
            }
        }
        return maxArea;
    }
    
    public int dfs(int[][] grid,int i, int j, int[][] dir,int counter){
        int r = grid.length;
        int c = grid[0].length;
        
        counter++;
        
        grid[i][j] = -1;
        
        for(int[] d:dir){
            int nr = i + d[0];
            int nc = j + d[1];
            
            if(isValid(r,c,nr,nc) && grid[nr][nc] == 1){
              counter = Math.max(counter,dfs(grid,nr,nc,dir,counter));
            }
        }
        // System.out.println(counter);
        return counter;
        
    }
    
    public boolean isValid(int r,int c,int nr, int nc){
        return nr>=0 && nc >= 0 && nc < c && nr < r;
    }
}
