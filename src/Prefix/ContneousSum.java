package Prefix;

public class ContneousSum {
    public static  void main(String[] args) {
        int arr[] = {1 , 2 , 3, 4, 5};
        int n = arr.length;
        int sum=0;

        int prefix[] = new int[0];
        prefix[0] = arr[0];
        for(int i=0; i<n; i++){
            prefix[i] = prefix[i-1] + arr[i];
            if(sum > 0 ){
                prefix[i] = arr[i];
            }
            System.out.println(prefix);
        }
    }
}
