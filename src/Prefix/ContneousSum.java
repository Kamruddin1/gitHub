package Prefix;
public class ContneousSum {
    public static void main(String[] args) {
        int arr[] ={4,5,6,9,7};
        int  n  =arr.length;

        int prefixSum[] = new int[n];
        prefixSum[0] = arr[0];

        for(int i=1; i<n; i++){
            prefixSum[i] = prefixSum[i-1] +arr[i];
        }

        // print
        for(int i=0; i<n; i++){
            System.out.print(prefixSum[i] + " ");
        }

    }
}

