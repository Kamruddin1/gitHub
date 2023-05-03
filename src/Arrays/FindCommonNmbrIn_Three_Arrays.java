package Arrays;

public class FindCommonNmbrIn_Three_Arrays {
    static  void ThreeCommonArrays(int arr1[], int arr2[], int arr3[]){
        int i=0, k=0, j=0;
        while(i<arr1.length && j< arr2.length && k< arr3.length){

            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){

                System.out.println(arr1[i] + " ");
                i++;
                j++;
                k++;

            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr2[j] < arr3[k]){
                j++;
            }
            else{
                k++;
            }
        }

    }
    public static void main (String [] args){
       // FindCommonNmbrIn_Three_Arrays arr = new FindCommonNmbrIn_Three_Arrays();
        int arr1[] = { 1, 5, 10, 20, 40, 80 };
        int arr2[] = { 6, 7, 20, 80, 100 };
        int arr3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
        System.out.println("common elements");
        ThreeCommonArrays(arr1,arr2,arr3);
    //  arr.ThreeCommonArrays(arr1,arr2,arr3);




        }
}
