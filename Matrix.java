import java.util.*;

class Matrix
{
    public static void search(int[][] a, int key){
        int n = a.length;
        int m = a[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(a[i][j]==key){
                    System.out.println("Found at "+i+" "+j);
                  
                }
            }
        }
        System.out.println("Not Found key");
    }
    
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and m = ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for(int i = 0; i < n; i++)  
        {
            for(int j = 0; j < m; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j=0; j<m; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Find the key");
        int key = sc.nextInt();
        search(a,key);
        sc.close();
    }

}