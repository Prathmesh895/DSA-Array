public class tringularNo {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
            }
            num++;
            System.out.println();
        }
    }
}
// output
//     1 
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5