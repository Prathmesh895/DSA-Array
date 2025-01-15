class Pen {
    public void printInfo(String color,int price){
        System.out.println(color + " " + price);
    }
}


public class polymorh {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.printInfo("red", 22);
    }
}
