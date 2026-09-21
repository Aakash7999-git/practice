import java.util.*;
class Solution {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
         int min = arr[0];
        int max = arr[0];
        List<Integer> ans = new ArrayList<>();
        // Find minimum and maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];

            if (arr[i] > max)
                max = arr[i];
        }

        // Find missing numbers
        for (int j = min; j <= max; j++) {

            boolean found = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == j) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                ans.add(j);
            }
        }

        System.out.print(ans);
    }
}
