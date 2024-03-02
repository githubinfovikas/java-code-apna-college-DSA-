import java.util.Scanner;

public class fibonachi {

    public static int fabo(int n) {
        if(n==0 || n==1){
            return n;
        }

      return fabo(n-1) + fabo(n-2);
    }

    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
   
            System.out.print(fabo(i)+ ", ");
        }
        sc.close();
    }
}
