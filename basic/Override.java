class Parent {
    public void add (int x, int y){
        System.out.println(x+y);
    }
}
class Child extends Parent{
    public void sub(int x, int y){
        System.out.print(x-y);
    }
}
public class Override{
    public static void main(String[]args){
        Parent pt = new Child();
        pt.add(7,9);
        }
}
