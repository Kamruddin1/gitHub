package Arrays;

public class ReverseArrays {
    static void reverseArrays(int arr[], int start,  int end){
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void printArrays(int arr[], int n){
        for(int i=0 ; i<n; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
       reverseArrays(arr,0,6);
        printArrays(arr,6);
        }}
