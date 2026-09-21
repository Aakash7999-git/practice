 class Addition {
    int a;
    int b;
    public void add(int a,int b){
        System.out.println(a+b);

    }
    public void add(int a,int b, int c){
        System.out.println(a+b+c);

    }
    public void add(int a,int b, int c, int d){
        System.out.println(a+b+c+d);
    }
    
}
public class polymorph{
    public static void main(String[]args){
    Addition ad = new Addition();
    ad.add(5,7);
    ad.add(5,7,9);
    ad.add(5,7,5,6);
    

    }
} 
