package recursion;
public class finacci {
int fib (int n){
    if(n==0 || n==1){
        return n;

    }
    return fib(n-1)+fib(n-2);
}


    
    public static void main (String []args){
        finacci fb = new finacci(); 
        int value = fb.fib(4);
        IO.println(value);
    }
    
}
