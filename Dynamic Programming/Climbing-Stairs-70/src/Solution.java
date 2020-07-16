/**
 * 
 * @author mohit_nirwan
 *
 *This is a DP solution, used in order to decrease the time complexity of a prblem from exponential
 *to linear time, and here used in an recursive manner
 *
 *The only differnce while using dp is that sub solutions are stored as soon as they are encountered, and
 *then while solving big problems, these stored solutions can be used to solve the entire problem
 */
class Solution {
    int[] arr = new int[100];
    
    public int climbStairs(int n) {
        
        if(n<=2){
            if(arr[n]==0){
                arr[n] = n;
            }
            else return arr[n];
           
        }
        
        if(arr[n]==0){ arr[n] =  climbStairs(n-1) + climbStairs(n-2);}
       
       return arr[n];
       
    }
    
    
}