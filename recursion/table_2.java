package recursion;

public class table_2 {
    static void table(int n){
    if(n==10){
        return;
    }
    IO.println("2 X "+n+" = "+n*2);
    table(n+1);
    }
    

void main(){
    table_2.table(1);
}
}
