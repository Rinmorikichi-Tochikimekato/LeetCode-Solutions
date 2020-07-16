
public class Solution1 {
	
class order{
        
        String str;
        int num;
        
        order(String s, int n){
            this.str = s;
            this.num = n;
        }
        
    };
    
    
    public List<String> topKFrequent(String[] words, int k) {
       
        Arrays.sort(words);
    

        int count = 1;        
        List<order> list = new ArrayList();
        
        for(int i=1;i<words.length;i++){
            if(words[i].contentEquals(words[i-1])){
                count++;
            }else{
                
                order orderCount = new order(words[i-1],count);
                count = 1;
                list.add(orderCount);
            }

        }
        
        int len  = words.length - 1;
        order orderCount = new order(words[len],count);
        list.add(orderCount);

        
     Collections.sort(list, (a, b) -> {
            return (b.num - a.num);
        });    
        
        
        List<String> ans = new ArrayList();
        
        for(int i =0;i<k;i++){
            //System.out.println(list.get(i).str+" "+list.get(i).num);
            ans.add(list.get(i).str);
        }
        
    return ans;
    }

}
