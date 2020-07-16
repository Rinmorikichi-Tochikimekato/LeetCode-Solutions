
public class SolutionIterativeDP {
	int arr[];
	  public boolean gameHelper(int N,boolean res){
	        if(N<=1){
	            return false;
	        }
	        if(N==2){
	        	if(arr[N]==0) {
	        		arr[N]= 2;
	        	}
	        	else return arr[N]%2==0;
	        }
	        
	        for(int i=1;i<=N/2;i++){
	            if(N%i==0){
	            	
	            if(arr[N]==0) {
	            	
	            	 res = res && !gameHelper(N-1,res);
	            	if(res == true) {
	            		arr[N]=2;
	            	}else {
	            		arr[N]=1;
	            	}
	            }else {
	            	return arr[N]%2==0;
	            }
	            
	            }
	        }
	        return arr[N]%2==0;
	        
	    }
	    
	    public boolean divisorGame(int N) {
	    	arr = new int[N+1];
	        
	       return gameHelper(N,true);
	    }

}
