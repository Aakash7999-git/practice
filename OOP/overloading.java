class first{
    void add(int a,int b){
        int x = a+b;
        System.out.println("Sum of A and B: "+ x);
    }
    void add (int a,int b,int c){
        int y = a+b+c;
        System.out.println("Sum of A and B and C: \n"+ y);
    }
}



public class overloading {
    public static void main(String[]args){
        first ft = new first();
        ft.add(20,10,10);
    }
    
}
