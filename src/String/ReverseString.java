package String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = sc.nextLine();
        int n  = a.length();
        String rev = "";
        for(int i=n-1; i>=0 ; i--){
            rev = rev+a.charAt(i);

        }
        System.out.println(rev);
//        String a = "Ansari";
//        int n = a.length();
//        String rev = "";
//        for(int i=n-1; i>=0; i--){
//            rev = rev + a.charAt(i);
//        }
//        System.out.println(rev);
    }
}
