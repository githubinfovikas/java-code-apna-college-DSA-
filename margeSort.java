public class margeSort {
    public static void margeSortFunction(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        margeSortFunction(arr, start, mid);
        margeSortFunction(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int n1 = start;
        int n2 = mid + 1;
        int k = 0;

        while (n1 <= mid && n2 <= end) {
            if (arr[n1] < arr[n2]) {
                temp[k] = arr[n1];
                n1++;
            } else {
                temp[k] = arr[n2];
                n2++;
            }
            k++;
        }

        while (n1 <= mid) {
            temp[k] = arr[n1];
            n1++;
            k++;
        }

        while (n2 <= end) {
            temp[k] = arr[n2];
            n2++;
            k++;
        }

        for (k = 0, n1 = start; k < temp.length; k++, n1++) {
            arr[n1] = temp[k];
        }
    }

    public static void main(String[] args) {
        
        int arr[] = { 12, 11, 13, 5, 6, 7, 3, 5, 4, 2, 22, 3, 4, 5, 3, 2, 4, 5 };
        int start = 0;
        int end = arr.length - 1;
        margeSortFunction(arr, start, end);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
