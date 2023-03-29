package Arrays;

public class SortZeroObeWithoutUsingSortingAlgo{
    static void ArraysSort(int arr[], int size){
        int low =0;
        int high = size-1;
        int mid = 0, temp =0;

        while (mid <= high){
            switch (arr[mid]){
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
//                    elemnets 1
                    mid++;
                    break;
                }
                case  2 : {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }

    }
   static void printArrays(int arr[], int a_size){
        for(int i=0; i< a_size; i++){
            System.out.print(arr[i] + " ");
        }
       System.out.println(" ");
   }
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,2,2,0,1,0,0,1};
        int a_size = arr.length;
        ArraysSort(arr,a_size);
        printArrays(arr,a_size);


    }
}

