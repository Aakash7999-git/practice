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



// package pattern;

// public class half_pyramid {
//     public static void main (String[]args){
//         int m=4;
//         for (int i = 1 ;i<=m;i++){
//             for(int j=0; j<=i;j++){
//                 if(i<j){
//                 System.out.print(" ");
//                 }
//                 else{
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// **
// ***
// ****
// *****




// opposite pyramid



public class half_pyramid {
    public static void main (String[]args){
        int m=6;
        for (int i = 1 ;i<=m;i++){
            for(int j = 1;j<=(m-i);j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
            
        }
        
    }
}










// special test 
// public class half_pyramid {
//     public static void main (String[]args){
//         int m=6;
//         for (int i = 1 ;i<=m;i++){
//             for(int j = 1;j<=(m-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1;j<=i;j++){
//                 System.out.print(" *");
//             }
//             System.out.println();
            
//         }
//         for (int i = m ;i>=m;i--){
//             for(int j = 1;j<=(m-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j = m;j>=i;j--){
//                 System.out.print(" *");
//             }
//             System.out.println();
            
//         }
        
//     }
// }