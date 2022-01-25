// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        System.out.print("Calculating " + m + " C " + n +" = ");
        System.out.println(Main.binomialCoeff(m,n));
        
    }
    
    public static int binomialCoeff(int m,int n){
        int a[][] = new int[m+1][m+1];
        for(int i=0;i<=m;i++) a[i][0] = 1;
        for(int i=1;i<=m;i++) a[i][i] = 1;
        
        for(int i=2;i<=m;i++){
            for(int j=1;j<=i;j++){
                a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
        }
        
        // for(int i=0;i<=m;i++){
        //     System.out.println();
        //     for(int j=0;j<=i;j++){
        //         System.out.print(a[i][j]+" ");
        //     }
        // }
    return a[m][n];
    }
}



// Finished in 236 ms
// Calculating 5 C 3 = 

// 1 
// 1 1 
// 1 2 1 
// 1 3 3 1 
// 1 4 6 4 1 
// 1 5 10 10 5 1 10
// Finished in 248 ms
// Calculating 5 C 3 = 10
// Finished in 214 ms
// Calculating 7 C 4 = 35
