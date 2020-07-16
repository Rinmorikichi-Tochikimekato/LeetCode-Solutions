class Solution {
    public String reverseWords(String s) {
         StringBuilder ans=new StringBuilder();
         s=s.trim();
        int i = s.length()-1;
        int j=0;
        while(i>=0){
            if(s.charAt(i)!=' '){
             int end = i;
             while(i>-1 && s.charAt(i)!=' ') i--;
             ans.append(s,i+1,end+1).append(" ");
            } 
            i--;
        }
        return ans.toString().trim();
    }
}


/*
//Solution 2 Using String.substring()
class Solution {
    public String reverseWords(String s) {
         String ans="";
         s=s.trim();
        int i = s.length()-1;
        int j=0;
        while(i>=0){
            if(s.charAt(i)!=' '){
             int end = i;
             while(i>-1 && s.charAt(i)!=' ') i--;
             ans+=s.substring(i+1,end+1)+" ";
            } 
            i--;
        }
        return ans.trim();
    }
    
       
    
}

*/


/*
//Solution 3 using recursion
class Solution {
    
    String ans="";
    int ind=0;
    public String reverseWords(String s) {
        s=s.trim();
       // System.out.println("o"+s+"o");
        int i = s.length()-1;
        while(i>=0){
            if(s.charAt(i)!=' '){
             i = helper(s,i);  
             if(i>0) ans=ans+" "; 
            } 
            i--;
        }
        return ans;
    }
       
        int helper(String s, int i){
            if(i<0 || s.charAt(i)==' ') {
                ind = i;
                return ind;
            }
            helper(s,i-1);
            ans = ans + Character.toString(s.charAt(i));
            return ind;
        }
}
*/