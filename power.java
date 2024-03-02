import java.util.Scanner;

public class power {
    public static long power(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * power(base, power - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base : ");
        int base = sc.nextInt();
        System.out.println("Enter the power : ");
        int power = sc.nextInt();
        System.out.println("Result : " + power(base, power));
        sc.close();
    }
}
