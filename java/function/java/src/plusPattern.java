// public class plusPattern {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i=1;i<=n*2-1;i++){
//             for(int j=1;j<=n*2-1;j++){
//                 if(i== n || j==n){
//                     System.out.print("+"+" ");
//                 }else{
//                     System.out.print(" "+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
   
// }

// output
//         +
//         +
//         +
//         +
// + + + + + + + + +
//         +
//         +
//         +
//         +


public class plusPattern {
    
    public static void main(String[] args) {
        int n = 5; // Number of rows
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((j + i) % n + 1);
            }
            System.out.println();
        }
    }
   
}