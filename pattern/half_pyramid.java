// package pattern;

// public class half_pyramid {
//     public static void main (String[]args){
//         int m=6;
//         for (int i = 0 ;i<=m;i++){
//             for(int j=0; j<=i;j++){
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }
//     }
// }
//out put 
// *
// **
// ***
// ****
// *****
// ******
// *******




// package pattern;

// public class half_pyramid {
//     public static void main (String[]args){
//         int m=6;
//         for (int i = m ;i>0;i--){
//             for(int j=0; j<=i;j++){
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }
//     }
// }

//out put
//  * * * * * * *
//  * * * * * *
//  * * * * *
//  * * * *
//  * * *
//  * *



package pattern;

public class half_pyramid {
    public static void main (String[]args){
        int m=4;
        for (int i = 1 ;i<=m;i++){
            for(int j=0; j<=i;j++){
                if(i<j){
                System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
