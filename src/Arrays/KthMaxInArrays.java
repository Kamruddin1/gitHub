package Arrays;

public class KthMaxInArrays {
    public static void main(String[] args) {
        int arr[] = {10, 11, 5, 1, 7, 6, 3};
        int n = arr.length;

        int kth = 3;
        for(int i=0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] < arr[j]){
                    int temp =  arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            // kth elementsblogics
            if(i == kth-1 ){
                System.out.println(kth + " largest " + arr[i]);
                break;
            }


        }
        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
