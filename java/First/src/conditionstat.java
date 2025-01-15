import java.util.Scanner;

public class conditionstat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt();
        // if(age>18){
        // System.out.println("Adult");
        // }else System.out.println("Minor");
        // if(a==b){
        // System.out.println("a is Equal to b");
        // }else if(a<b){
        // System.out.println("a is less than b");
        // }else{
        // System.out.println("a is greter than b");
        // }

        switch (a) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Hi");
                break;

            default: System.out.println("Bye");
                break;
        }
    }
}
