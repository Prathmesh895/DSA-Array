// public class butterfly {
//     public static void main(String[] args){
//         int n=4;
//         //upper half 
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=(n-i)*2;j>=1;j--){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         //lower half 
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=(n-i)*2;j>=1;j--){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Output 
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *

//for holow butterfly 

// public class butterfly {

//     public static void main(String[] args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if(j==1 || j==i){
//                     System.out.print("*");
//                 }else System.out.print(" ");
//             }
//             for(int j=1;j<=(n-i)*2;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 if(j==1 || j==i){
//                     System.out.print("*");
//                 }else System.out.print(" ");
//             }
//             System.out.println();
//         }

//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 if(j==1 || j==i){
//                     System.out.print("*");
//                 }else System.out.print(" ");
//             }
//             for(int j=1;j<=(n-i)*2;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 if(j==1 || j==i){
//                     System.out.print("*");
//                 }else System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }

//output 
// *        *
// **      **
// * *    * *
// *  *  *  *
// *   **   *
// *   **   *
// *  *  *  *
// * *    * *
// **      **
// *        *

