package Arrays;

public class SubArraysSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;

//       for(int start= 0;start<n; start++){
//           for(int end = start; end<n; end++){
//               int sum = 0;
//               for(int i=start; i<=end; i++){
//                   sum += arr[i];
//                   System.out.print(arr[i] + " ");
//               }
//               System.out.println(" ===>"+ sum);
//           }
//       }

        // time complexcity of this oproach o(n^3)

        // lest see seconds aproach


        for(int start = 0; start<n; start++){
            int sum = 0;
            for(int end = start; end<n; end++){
                sum += arr[end];
                System.out.println(sum + " ");
            }
        }

        // time complexcity of this oproach o(n^2)
    }
}
