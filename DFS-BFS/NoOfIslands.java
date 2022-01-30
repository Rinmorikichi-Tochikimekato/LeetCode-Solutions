// 200. Number of Islands
// Medium

// 12022

// 305

// Add to List

// Share
// Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

// An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

// Example 1:

// Input: grid = [
//   ["1","1","1","1","0"],
//   ["1","1","0","1","0"],
//   ["1","1","0","0","0"],
//   ["0","0","0","0","0"]
// ]
// Output: 1
// Example 2:

// Input: grid = [
//   ["1","1","0","0","0"],
//   ["1","1","0","0","0"],
//   ["0","0","1","0","0"],
//   ["0","0","0","1","1"]
// ]
// Output: 3
 

// Constraints:

// m == grid.length
// n == grid[i].length
// 1 <= m, n <= 300
// grid[i][j] is '0' or '1'.
// Accepted
// 1,394,410
// Submissions
// 2,635,645


class Solution {
    
    class Point{
        int x;
        int y;
        
        public Point(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    
    public int numIslands(char[][] grid) {
        
        int[][] dir = new int[][] {{0,1},{1,0},{0,-1},{-1,0}};
        
        int r = grid.length;
        int c = grid[0].length;
        
        Queue<Point> que = new LinkedList();
        
        int counter = 0;
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                
                if(grid[i][j] == '1'){
                    // que.offer(new Point(i,j));
                    
                    grid[i][j] = 'x';
                    counter++;
                    
                    dfs(grid,i,j,dir);
                }
                
               // bfs(grid,que,dir);
                
            }
        }
        
        return counter;
        
    }
    
    public  void dfs(char[][] grid, int i, int j,int[][] dir){
        int r = grid.length;
        int c = grid[0].length;
                    for(int[] d:dir){
                        int nr = i + d[0];
                        int nc = j + d[1];
                        if(isValid(nr,nc,r,c) && grid[nr][nc] == '1'){
                            grid[nr][nc] = 'x';
                            dfs(grid,nr,nc,dir);
                        }
                    }

    }
    
    
    public  void bfs(char[][] grid, Queue<Point> que, int[][] dir){
        int r = grid.length;
        int c = grid[0].length;
        
         while(!que.isEmpty()){
                    Point p = que.poll();
                    for(int[] d:dir){
                        int nr = p.x + d[0];
                        int nc = p.y + d[1];
                        
                        if(isValid(nr,nc,r,c) && grid[nr][nc] == '1'){
                            que.add(new Point(nr,nc));
                            grid[nr][nc] = 'x';
                        }
                    }
                }
    }
    
    public  boolean isValid(int nr,int nc,int r,int c){
        return nr<r && nc<c && nc>=0 && nr>=0;
    }
}
