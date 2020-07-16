/**
 * 
 * @author mohit_nirwan
 *this solution is an recursive approach to tackle this problem, which will eventually give you
 *time limit exceeded for the bigger inputs, but works for the easier Inputs and give you the basic intuition to
 *deal with this problem
 */

class SolutionRecursiveWithoutDP {
    
    public boolean gameHelper(int N,boolean res){
        if(N<=1){
            return false;
        }
        if(N==2){
            return true;
        }
        
        for(int i=1;i<=N/2;i++){
            if(N%i==0){
             res = res && !gameHelper(N-1,res);
            }
        }
        return res;
        
    }
    
    public boolean divisorGame(int N) {
        
       return gameHelper(N,true);
    }
}
