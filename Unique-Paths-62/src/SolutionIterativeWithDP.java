
class SolutionIterativeWithDP {
    
    
    public int uniquePaths(int m, int n) {
        //System.out.println(helperFunc(m,n,0,0));
     
        int[][] arr = new int[m][n];
        
        //setting the base condition
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                if(i==0||j==0){
                    arr[i][j]=1;
                }else
                {    
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
                }
             
            }
        }
        
        return arr[m-1][n-1];
    }
}