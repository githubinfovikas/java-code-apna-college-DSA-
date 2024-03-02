public class diagnolSum {
    public static void diagnolSumFunction(int a[][]){
     int sum =0;
        for(int i=0; i<a.length; i++){
            // pd
            sum += a[i][i];
            // sd
            if(i != a.length - i - 1){
                sum +=a[i][a.length - i - 1];
            }
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        int matrix [][] = {{1,6,9,4},{5,6,7,8},{9,10,11,12},{3,4,5,6}};
        diagnolSumFunction(matrix);
    }
}
