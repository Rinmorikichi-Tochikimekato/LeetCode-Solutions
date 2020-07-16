class Solution {
    int ans = 0;
    public int numIslands(char[][] grid) {
    
        int r = grid.length;
        int c = r==0 ? 0 : grid[0].length;
        
        int maxR = 0;
        int maxC = 0;
        
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]!='0')
                   ans+= helper(grid,i,j);
            }
        }   
        
        return ans;
    }
    
    
    int helper(char[][] grid,int i,int j){
    
       // System.out.println(i+" "+j);
        
        int r = grid.length;
        int c = r==0 ? 0 : grid[0].length;
        
        grid[i][j]='0';
        
        if(i-1>=0 && grid[i-1][j]=='1') helper(grid,i-1,j);
        if(j-1>=0 && grid[i][j-1]=='1') helper(grid,i,j-1);
        if(i+1<r && grid[i+1][j]=='1') helper(grid,i+1,j);
        if(j+1<c && grid[i][j+1]=='1') helper(grid,i,j+1);
        
        return 1;
        
        
    }
    
    
}