package Arrays;
public class MAx_And_Min_Arrays {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>max) {
                int temp = arr[i];
                arr[i] = max;
                max = temp;
            }
            }
        System.out.println(max);


    }

}
