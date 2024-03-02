import java.util.*;

public class palidrome {
    public static void palidromeCheck(String str) {
        int start = 0;
        int end = str.length()-1;
        while (start<end) {
            if(str.charAt(start) != str.charAt(end)) {
                System.out.println(str + " Not a palidrome");
                return;
            }
            start++;
            end--;
        }

        System.out.println(str + " palidrome");


    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("String is : " + str);
        palidromeCheck(str);
        sc.close();
    }
}
