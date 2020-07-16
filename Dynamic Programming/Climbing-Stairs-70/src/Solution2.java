/**
 * 
 * @author mohit_nirwan
 *
 *This solution is an iterative way to solve the given problem, which works in the exactly similar way
 *just that the solution requires less space and works a lot faster than the recursive solution.
 */
class Solution2 {
    
    
    public int climbStairs(int n) {
        
      
        
       if(n<=2){
           return n;
       } 
        
          int[] arr = new int[n+1];
        
        arr[1]=1;
        arr[2]=2;
        
        for(int i=3;i<=n;i++){
            arr[i] =  arr[i-1] + arr[i-2];
        }
    
       
       return arr[n];
       
    }
    
    
}