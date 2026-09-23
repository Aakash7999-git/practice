class parent{
    String name = "Aakash";
    int age = 22;
    String add = "kandivali";

}
class child extends parent{
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(add);
    }
}
class inheritance{
    public static void main(String[]args){
        child ch = new child();
        ch.display();
    }
}