class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
     List<List<String>> list = new ArrayList();
        Arrays.sort(products);
        // for(String str:products) System.out.print(str+" ");
        // System.out.println();
        int count=0;
        for(int i=1;i<=searchWord.length();i++){
            
            String comp = searchWord.substring(0,i);
            
            
           int start = Arrays.binarySearch(products, comp);
           if(start<0) start = -start-1;
            
//             int start=0;
//             int end= products.length-1;
            
//             while(start<=end){
//                 int mid = (start+ end)/2;
                
//                 if( products[mid].startsWith(comp) ){
//                     break;
//                 }
                
//                 if(products[mid].compareTo(comp)<0) start=mid+1;
//                 else end = mid-1;
                
//             }
            
            int up = Math.min((start+3),products.length);
             List<String> locList = new ArrayList();
            
            for(int j=start;j<up;j++){
                
                if(comp.length()>products[j].length())continue;
                
                if( products[j].substring(0,i).contentEquals(comp) ){
                    locList.add(products[j]);
                    count++;
                }
                if(count==3) break;
            }
            
            count = 0;
            
          //  System.out.println(start);
            
            
            
            list.add(locList);    
        }
        
        return list;
        
        
    }
}