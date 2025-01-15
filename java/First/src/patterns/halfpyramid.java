// // package patterns;

// // import java.util.Arrays;

// // public class halfpyramid {
// // public static void main(String[] args){
// // int[] numbers = {9,8,7,6,5,4,3,2,1};
// // int r = numbers.length-1;
// // int l= 0;
// // System.out.println(Arrays.toString(numbers));
// // for(int i=l;i<r;i++){
// //         int temp=numbers[l];
// //         numbers[l]=numbers[r];
// //         numbers[r]=temp;
// //         l++;
// //         r--;
// // }
// // System.out.println(Arrays.toString(numbers));
// // }

// // }

// package patterns;

// import java.util.Arrays;

// public class halfpyramid {

//     public static void main(String[] args){
//         int[] nums = {2,4,1,5,7,9,22};
//         int n = nums.length;
//         int Sn = Integer.MIN_VALUE;
//         int Bn = Integer.MAX_VALUE;
//         for(int i=0;i<n;i++){
//                 if(nums[i] > Sn){
//                     Sn=nums[i];
//                 }
//                 if(nums[i] < Bn){
//                     Bn=nums[i];
//                 }
//         } 
//         System.out.println(Sn);
//         System.out.println(Bn);

//     }
// }

package patterns;

public class halfpyramid {
    private static int[] arr = { 6, 3, 5, 2, 1, 3, 7, 4, 1 };

    public static int getmax() {
        int maxi = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (maxi < arr[i]) {
                maxi = arr[i];
            }
        }
        // System.out.println(maxi);
        return maxi;
    }

    public static void barChart() {
        int max = getmax();
        for (int i = max; i >= 1; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= i) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("Bar Chart Representation:");
        barChart();
    }
}
