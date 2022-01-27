// Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.

// The distance between two adjacent cells is 1.

 

// Example 1:


// Input: mat = [[0,0,0],[0,1,0],[0,0,0]]
// Output: [[0,0,0],[0,1,0],[0,0,0]]
// Example 2:


// Input: mat = [[0,0,0],[0,1,0],[1,1,1]]
// Output: [[0,0,0],[0,1,0],[1,2,1]]
 

// Constraints:

// m == mat.length
// n == mat[i].length
// 1 <= m, n <= 104
// 1 <= m * n <= 104
// mat[i][j] is either 0 or 1.
// There is at least one 0 in mat.


class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
    int m = mat.length; 
    int n = mat[0].length;
    
    int res[][] = new int[m][n];
    
    int[][] dir = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        
    Queue<int[]> que = new LinkedList();
    
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(mat[i][j] == 0){
                res[i][j] = 0;
                que.offer(new int[]{i,j});
            }else{
                res[i][j] = Integer.MAX_VALUE;
            }
        }
    }
     
    // System.out.println(que);
        
    while(!que.isEmpty()){
        int iter[] = que.poll();
        int r = iter[0];
        int c = iter[1];
        for(int[] d: dir){
            int nr = r + d[0];
            int nc = c + d[1];
           
            if(valid(nr,nc,m,n) && res[r][c] + 1 < res[nr][nc]){
                res[nr][nc] = res[r][c] + 1;
                que.offer(new int[]{nr,nc});
            }
        }
    
    }
    return res;
    }
    
    
  public static boolean valid(int r,int c, int m, int n){
      return r>=0 && c>=0 && c<n && r<m; 
  }  
}
