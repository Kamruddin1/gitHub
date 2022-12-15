package Sliding_window;

public class kth_Elements_Sum {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int n = arr.length;
        int k=3;
        int sum=0;
        for(int i=0; i<n-k; i++){
            sum+=arr[i];
        }
        for(int i=k; i<n; i++){
            sum += arr[i];
            sum -= arr[i-k];
            System.out.println(sum);
        }

    }
}
