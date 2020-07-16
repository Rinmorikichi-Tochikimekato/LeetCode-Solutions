import java.util.Stack;

class Solution {
   static  public String decodeString(String s) {
        
        String print = "";
        String mainprint = "";
        int i=0;
        Stack<Character> stack = new Stack<Character>();
        
        while(  i < s.length() ){
            
            if(s.charAt(i) != ']'){
                stack.add(s.charAt(i));
               
            }
            else{
            	//System.out.println(stack.pop());
                
            	char news = stack.pop();
                while(news != '[') {
                	print = news + print;
                	news = stack.pop();
                }
                //System.out.println("ch-"+print);
                //System.out.println("[-"+stack.pop());
                String inter = ""+stack.pop();
              //  System.out.println("no-"+inter);
                int noOfTimes = Integer.parseInt(inter);
                inter="";
                for(int max=0;max<noOfTimes;max++) {
                	inter += print;
                }
                print = inter;
                }
            
           if(stack.isEmpty()) {
        	   
        	   mainprint=mainprint+print; 
        	   print="";
           }
           
            i++;
            
        }
        mainprint = mainprint + print;
        if(i == s.length()){
            while(!stack.isEmpty()){
            	mainprint += stack.pop();
            }
                
            }
        return mainprint;
    }
    
    public static void main(String[] args) {
		//String s = "2[a]3[b]4[d]";
		//String s= "3[a2[b4[c]]]";
    	String s = "2[a2[b]c]";
    	s=decodeString(s);
		System.out.println(s);
    }
}