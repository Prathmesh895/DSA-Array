public class InvertedHailpyramid {
    public static void main(String[] args){
        int n = 4;
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
//inverted 
        int space= n-1;
        int star = 1;
        for(int i=1;i<=n;i++){
            //for printing space
            for(int j=i;j<=space;j++){
                System.out.print(" ");
            }
            //for printing space
            for(int k=star;k<=i;k++){
                System.out.print("*");
               
            }
            System.out.println();
        }
    }
}
