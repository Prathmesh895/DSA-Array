
public class Array {
    public static void main(String[] args){
        int[] marks ={1,2,5,6,3,7};
       int min = Integer.MAX_VALUE;
       int max= Integer.MIN_VALUE;
       for(int i = 0 ;i<marks.length;i++){
        if(marks[i]< min){
            min = marks[i];
        }
        if(marks[i]>max){
            max = marks[i];
        }
       }
       System.out.println("Max number is = "+max);
       System.out.println("MIn number is = "+min);
    }
}
