public class avgOfnum {

    public static void main(String[] args) {
        int a = 10;
        int b= 10;
        System.out.println(powerOfNum(a, b));
    }

    // for calculation of power 
    public static long powerOfNum(int n,int p){
        long power = 1;
        for(int i = 1;i<= p;i++){
            power = power * n;
        }
        return power;
    }

    // for calculation of circumference of circle
    // public static int CircumOfCir(int r) {
    //     return (int) (2 * 3.14 * r);
    // }

    // for printing avg
    // public static int Avg(int a,int b,int c){
    // int avg = (a+b+c)/(3);
    // return avg;
    // }

    // for print sum of odd from 1 to n
    // public static int SumOfOdd(int n){
    // int sum =0;
    // for(int i =1;i<=n;i++){
    // if(i%2 != 0){
    // sum = sum + i;
    // }
    // }
    // return sum;
    // }

}
