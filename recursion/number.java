
package recursion;

public class number {
    static void num(int n){
        if(n>10){
            return;
           
        }
         IO.print(n+" git add ");
         num(n+1);
            
    }
    void main(){
        number.num(5);
    }

    }