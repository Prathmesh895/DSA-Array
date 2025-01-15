class Pen{
    String color;
    String type;
    
    public void printInfo(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
public class object {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Red";
        p1.type = "ballPoint";
        p1.printInfo();
    }
}
