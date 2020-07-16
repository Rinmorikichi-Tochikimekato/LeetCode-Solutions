class Solution {
    int globalMin = Integer.MAX_VALUE;
    public int minPathSum(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
    
   
           return  helperFunc(grid,0,0,m,n,grid[0][0]);      
        
        
        
    }
    
    public int helperFunc(int[][] grid,int m,int n,int r,int c,int count){
        
     
        
        if(m+1<r){
            helperFunc(grid,m+1,n,r,c,count+grid[m+1][n]);
        }
        
        if(n+1<c){
            helperFunc(grid,m,n+1,r,c,count+grid[m][n+1]);
        }
        
           if(m==r-1&&n==c-1){
              
            globalMin = Math.min(globalMin,count);
        }
        
         //System.out.println("gm"+globalMin+" count="+count);
        return globalMin;
        
    }
}