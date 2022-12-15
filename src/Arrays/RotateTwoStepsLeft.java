package Arrays;

public class RotateTwoStepsLeft {
    public static int reverse(int arr[], int i, int j){
        int left = i;
        int right = j;
        while (left < right) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return reverse(arr,i,j);

    }
    public static int rorate(int arr[] , int k){
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k, arr.length-1);
        reverse(arr,0, arr.length-1);
        return rorate(arr,k);
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int n = arr.length;
        int k = 2;
        for(int i=0; i<n; i++){
            System.out.println(rorate(arr,k));
        }


    }
}
