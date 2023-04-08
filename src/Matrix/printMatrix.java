package Matrix;
public class printMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,5}, {3,4,3}};
        int n = arr.length;
        int m = arr.length;
        for(int i=0; i<n; i++) {
            for (int j =0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
