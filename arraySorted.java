import java.util.Arrays;
import java.util.Scanner;

public class arraySorted {
    public static void isSorted(int[] arr) {
       Arrays.sort(arr);
       for(int element : arr) {
           System.out.print(element+ ",");
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        sc.close();
        isSorted(arr);
        

    }
}
