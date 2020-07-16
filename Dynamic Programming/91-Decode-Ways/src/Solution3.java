/***
 * 
 * @author rintoshi
 *Iterative approach to solve the problem, using DP
 */
class Solution3 {
    public int numDecodings(String s) {
        
        int len = s.length();
       int mem[] = new int[len+1];
        
        
        mem[0]=1;
        
        mem[1]= (s.charAt(0) == '0') ? 0 : 1;
        
        
        for(int i=2;i<len+1;i++){
            
             int a = Integer.parseInt(s.substring(i-1,i));
             int b = Integer.parseInt(s.substring(i-2,i));
            //System.out.println(a+" "+b);
            if(a>=1){
                mem[i]+=mem[i-1];
        
            }
            
                if(b>9 && b<=26)
                {
                    mem[i]+=mem[i-2];
                }  
          
    }
            
     return mem[len];
    }
}
