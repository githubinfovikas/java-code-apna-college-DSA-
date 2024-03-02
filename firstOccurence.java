
public class firstOccurence {
    public static void firstOccur(int arr[],int target,int index){
        if(index == arr.length){
            System.out.println("Not found");
            return;
        }
        if(arr[index]==target){
            System.out.println(index);
            return;
        }
        firstOccur(arr,target,index+1);


    }
    public static void main(String[] args) {
        
        int arr[] = {4,5,3,2,5,6,4,3,1,232,123,2,1,2,3,4,5,6,7,8,9,10,200,12,13,14,15,16,17,18,19,20};
        firstOccur(arr,200,0);
    }
}
