
// public class stringBuilder {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("tony");
//         System.out.println(sb);
//         // charAt 
//         System.out.println(sb.charAt(0));

//         // replace charAt 0 index 
//         sb.setCharAt(0,'S');
//         System.out.println(sb);
//     }
// }

public class stringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        sb.insert(2, 'n');
        System.out.println(sb);

        sb.delete(2, 4);
        System.out.println(sb);
    }
}