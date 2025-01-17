import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] nums = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                nums[i][j]= sc.nextInt();
            }
        }

        // for printing 2D Array
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        int target = 5;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(nums[i][j]==target){
                    System.out.println("Target is at "+i+","+j);
                }
            }
        }
    }
}
