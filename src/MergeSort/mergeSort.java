package MergeSort;

public class mergeSort {
    static  void divide(int arr[], int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start )/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conquer(arr, start, mid+1, end);


    }
    static  void conquer (int arr[], int start, int mid, int end){
        int merged[] = new int[end-start + 1];
        int idx1 = start;
        int idx2 = mid+1;
        int x =0;
        while (idx1 <= mid && idx2 <= end){
           if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }
            else{
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        while (idx1 <= end){
            merged[x++] = arr[idx2++];
        }
        for(int i=0, j=start; i<merged.length; i++,j++){
            arr[i] =merged[i];
        }

    }

    public static void main(String[] args) {
        int arr[] = {10, 50, 30,40, 20};
        int n = arr.length;
        divide(arr,0,n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
