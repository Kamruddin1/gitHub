package String;

import java.util.Scanner;

public class Lexicographical_arrangemnebt_string {
    public static void main(String[] args) {
        System.out.println("Enter the string ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String temp = null;
        String a[] = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Answer :");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
