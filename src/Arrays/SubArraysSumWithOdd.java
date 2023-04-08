package Arrays;

public class SubArraysSumWithOdd {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;

        int even = 0;
        int odd = 0;

        int sum =0;
         for(int i=0; i<n; i++){
             sum += arr[i];
             if(sum % 2 == 0){
                 even++;

             }
             else {
                 odd++;
             }
         }
         int ans  = odd * (even +1);
        System.out.println(ans);

    }
}
