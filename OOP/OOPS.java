class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing");

    }
    public void printColor(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
public class OOPS{
    public static void main(String[]args){
        Pen pen1 = new Pen();
        Pen Pen2 = new Pen();
        pen1.color = "blue";
        pen1.type = "ball";

        Pen2.color = "black";
        Pen2.type = "gel";

        pen1.write();
        pen1.printColor();
        Pen2.printColor();
    }
}