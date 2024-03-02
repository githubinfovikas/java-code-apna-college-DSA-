import java.util.Scanner;

public class printNumberDecOrder {
    public static void printDecOrder(int n) {
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        printDecOrder(n-1);
    }
    public static void printIncOrder(int n){
        if(n==0){
            return;
        }
        printIncOrder(n-1);
        System.out.print(n + " ");
 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Dec Order");
        printDecOrder(n);
        System.out.println();
        System.out.println("Inc Order");
        printIncOrder(n);
        sc.close();
    }
}
