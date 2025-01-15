public class loop {
    public static void main(String[] args) {

        // solid rectangle
        // for(int i = 0;i<4;i++){
        // if(i == 0 || i == 3){
        // for(int j=1 ;j<=4;j++){
        // System.out.print("*");
        // }
        // }else {
        // for(int j=1 ;j<=4;j++){
        // System.out.print(j);
        // }
        // }
        // System.out.println();
        // }

        // hollow rectangle

        int n = 6;
        int m = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(j-1);
                }
            }
            System.out.println();
        }
    }
}
