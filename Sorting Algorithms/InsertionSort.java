// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input[] = new int[n];
        for(int i=0;i<n;i++){
            input[i] = sc.nextInt();
        }
        // for(int i=0;i<n;i++){
        //     System.out.println(arr[i]);
        // }
        
        Main.sort(input);
        
    }
    
    public static void sort(int[] a){
        int n = a.length;
        
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(a[j] > a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
            System.out.println();
            for(int k=0;k<n;k++){
                System.out.print(a[k]+" ");
            }
        }
    }
}


// Finished in 223 ms
// Hello World!

// 3 3 3 3 
// 2 2 2 2 
// 1 1 1 1 
// Finished in 271 ms
// Hello World!

// 4 3 2 1 
// 4 3 2 1 
// 4 3 2 1 
// Finished in 167 ms
// Hello World!

// 3 4 2 1 
// 2 3 4 1 
// 1 2 3 4 
// Finished in 210 ms
// Hello World!

// 3 4 2 10 12 1 5 6 
// 2 3 4 10 12 1 5 6 
// 2 3 4 10 12 1 5 6 
// 2 3 4 10 12 1 5 6 
// 1 2 3 4 10 12 5 6 
// 1 2 3 4 5 10 12 6 
// 1 2 3 4 5 6 10 12 
