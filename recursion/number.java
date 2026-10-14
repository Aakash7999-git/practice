
package recursion;

public class number {
    // static void num(int n){
    //     if(n>10){
    //         return;
           
    //     }
    //      IO.print(n+" ");
    //      num(n+1);
            
    // }
    // void main(){
    //     number.num(5);
    // }

    static void num(int n){
        if(n==0){
            return;
        }
        IO.print(n);
        num(n-1);
       }
       void main(){
        num(8);
       }
    }