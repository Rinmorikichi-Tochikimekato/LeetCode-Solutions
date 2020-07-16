
public class RecursiveWithoutDP2 {

class Solution {
    public int helperFunc(int m,int n){
    
            if( m == 1 && n == 1){
                    return 1;
                }
            if(m==0|| n==0){
                return 0;
            }
    
         return helperFunc(m,n-1) + helperFunc(m-1,n); 
        
    }
    
    public int uniquePaths(int m, int n) {
        //System.out.println(helperFunc(m,n,0,0));
        return helperFunc(m,n);
    }
}

}
