
import java.util.*; 
public class pln {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev =0;
        int ori = n;
         while(n>0){
            int digit = n%10;
            rev = rev*10+digit;
            n=n/10;
         }

         if(ori==rev){
            System.out.print("true")
         }
         else{
            System.out.println("false");
         }
    }
}
