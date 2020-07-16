class Solution {
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int[][] arr = new int[m][n];
        arr[0][0] = grid[0][0];
        
        for(int i=1;i<m;i++){
            arr[i][0] = grid[i][0] + arr[i-1][0];
        }
        
        for(int i=1;i<n;i++){
            arr[0][i] = grid[0][i] + arr[0][i-1];
        }
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                
                    arr[i][j] = Math.min(arr[i-1][j] , arr[i][j-1]) + grid[i][j];
                
            }
        }
        
        return arr[m-1][n-1];
        
    }
    
    
    
    public static void main(String[] args) {
		int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
		
		int res = minPathSum(arr);
		System.out.println(res);
	}
    
}


