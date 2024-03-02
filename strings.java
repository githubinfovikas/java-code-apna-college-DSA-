import java.util.*;
public class strings {
        public static void printChar (String str) {
            for(int i=0; i<str.length(); i++){
                System.out.print(str.charAt(i) + " ");
            }
            return;
        }
        public static void main(String[] args) {
            String str;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string");
            str = sc.nextLine();
            
            System.out.println("Full name is: " + str);
            printChar(str);
            sc.close();

        }
    
        
}
