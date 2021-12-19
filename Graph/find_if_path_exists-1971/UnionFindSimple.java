class UnionFindSimple {
     //union find Simple
    int[] uf;
    
    public boolean validPath(int n, int[][] edges, int start, int end) {
        
    uf = new int[n];
        
    UF(uf);
  
    for(int[] edge:edges){
        union(edge[0],edge[1]);
    }
    
    print(uf);
    return isConnected(start,end);
}
    
    
    
    //Print UF
    void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    
    //function to init union find
    void UF(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = i;
        }
    }
    
    //function to unionize the graph
    void union(int p, int q){
        int pParent = uf[p];
        int qParent = uf[q];
        
        for(int i=0;i<uf.length;i++){
            if(qParent == uf[i]){
                uf[i] = pParent;
            }
        }
    }
    
    //function to check if they are connected
    boolean isConnected(int p, int q){
        return uf[p] == uf[q];
    }
}   
