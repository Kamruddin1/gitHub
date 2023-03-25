package RevisionAllTopics;

public class SecondMax {
    public static void main(String[] args) {
//        int arr[] = {10,20,30,40,60};
//        int n = arr.length;
//        int max = 0;
//        int secMax = 0;
//        for(int i=0; i<n; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//            else if(arr[i] > secMax && secMax!=max){
//                secMax = arr[i];
//            }
//        }
//        System.out.println("first max"+ max);
//        System.out.println("second max" + secMax);
        int[] nums = { 50, 6, 60, 70, 80, 90, 9, 150, 2, 35 };
        int max = 0;
        int secmax = 0;

        for (int x = 0; x < nums.length; x++) {
            if (nums[x] > max)
                max = nums[x];
            if (nums[x] > secmax && secmax != max)
                secmax = nums[x];
        }

        System.out.println("1st H value: " + max);
        System.out.println("2nd H Value: " + secmax);
    }
}
