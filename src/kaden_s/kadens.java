package kaden_s;
public class kadens {
    public static void main(String[] args) {
        int arr[] = {-10,4, 7, -8, 14, 15, 6};
        int n = arr.length;
        int sum = 0;

        int SumMax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){

            sum += arr[i];

//            if(sum > SumMax){
//                SumMax = sum;
//            }
            SumMax = Math.max(SumMax,sum);
            if(sum < 0 ){
                sum = 0;
            }

        }
        System.out.println(sum + " ");
    }
}
