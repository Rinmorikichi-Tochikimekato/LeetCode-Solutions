/***
 * 
 * @author rintoshi
 *This is the solution 2, or a extended solution to the previous problem. Since we would be repeating things in the 
 *previous solution, mow we can use memoization in order to improve this question.
 */
class Solution2 {
    int len;
    int mem[];
    public int numDecodings(String s) {
       mem = new int[s.length()+1];
        Arrays.fill(mem,-1);
        len = s.length();
        return helper(s,0);
            
    }
    
    
    public int helper(String str, int i){
        
        if(i==len){
            return 1;
        }
        
        if(str.charAt(i)=='0'){
            return 0;
        }
        
        if(mem[i]!=-1){
            return mem[i];
        }
       
        int  max1=helper(str,i+1);
          
        int max2 = 0;
        
       if( i+1<len && Integer.parseInt(str.substring(i,i+2))<=26){
           max2=helper(str,i+2);
       }
        
        mem[i] = max1+max2;
        return mem[i];

    }
}