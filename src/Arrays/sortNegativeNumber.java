package Arrays;
public class sortNegativeNumber {

    public static void main(String[] args) {
        int arr[] = {10,-23,4,8,-6,-70};
        int n= arr.length;
        int  left = 0;
        int right = n-1;

        while(left <= right){
            if(arr[left] <0 && arr[right] < 0){
                left++;
            }
            else if(arr[left] > 0 && arr[right] < 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if(arr[left] > 0 && arr[right] > 0){
                right--;
            }
            else {
                left++;
                right--;
            }
        }
        for(int i=0; i<n-1; i++){
            System.out.print(arr[i]+ " ");
        }
    }

}
