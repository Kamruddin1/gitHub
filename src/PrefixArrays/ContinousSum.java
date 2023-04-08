package PrefixArrays;
public class ContinousSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n =arr.length;

        int prefixSum[] = new  int[n];
        prefixSum[0] = arr[0];

        for(int i=1;i<n; i++){
            prefixSum[i] = prefixSum[i-1]  + arr[i];

        }
        for(int i=0; i<n; i++){
            System.out.println(prefixSum[i]);
        }

    }
}
