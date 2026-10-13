package recursion;

public class even_odd {
    static void num(int n){
        if(n>100){
             return ;
            }
            if(n%2==0){
                IO.print("even numver");
            }
            else{
                IO.print("odd numbers");
            }
            num(n+1);
            }
       
    void main(){
        num(1);
    }
}
