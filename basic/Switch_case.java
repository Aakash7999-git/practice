import java.util.Scanner;
public class Switch_case {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter month");
    int month = sc.nextInt();

    switch(month){
        case 1:
            System.out.println("januray");
            break;
        case 2:
            System.out.println("faburay");
            break;
        case 3:
            System.out.println("march");
            break;
        default:
            System.out.println("good");
    }

}
    
}
