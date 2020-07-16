
public class RecursiveWithoutDP {
	

    public int helperFunc(int m,int n, int i,int j){
    
            if(i+1== m && n == j+1){
                    return 1;
                }
            if(i==m || j==n){
                return 0;
            }
    
         return helperFunc(m,n,i+1,j) + helperFunc(m,n,i,j+1); 
        
    }
    
    public int uniquePaths(int m, int n) {
        //System.out.println(helperFunc(m,n,0,0));
        return helperFunc(m,n,0,0);
    }


}
