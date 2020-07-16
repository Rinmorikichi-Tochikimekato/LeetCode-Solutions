class Solution {

public List<List<String>> suggestedProducts(String[] products, String searchWord) {
     List<List<String>> list = new ArrayList();
        Arrays.sort(products);
        int start = 0;
        int count=0;
        for(int i=1;i<=searchWord.length();i++){
            
            String comp = searchWord.substring(0,i);
            
            
            List<String> locList = new ArrayList();
            for(String str:products){
                
                if(comp.length()>str.length())continue;
                
                if( str.substring(0,i).contentEquals(comp) ){
                    locList.add(str);
                    count++;
                }
                if(count==3) break;
            }
            count = 0;
            list.add(locList);    
        }
        
        return list;
        
        
    }
}