import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static int[] arryInput(int n){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            arr[i] = value;
        }
        return arr;
    }
    public static void main(String[] args) {
      int arr [] = arryInput(5);  

    //   for (int i = 0; i < arr.length; i++) {
    //     System.out.println(arr[i]);
    //   }

    System.out.println(Arrays.toString(arr));
    }
}
