//package A_test;
//
//import java.util.Scanner;
//
//public class ttt {
//    public static int lengthOfLastWord(String s) {
//        if (s == null || s.length() == 0) {
//            return 0;
//        }
//        int c = 0;
//        int i = s.length() - 1;
//        while (i >= 0) {
//            if (s.charAt(i) == ' ' && c == 0) { // trim
//                i--;
//            } else if (s.charAt(i) != ' ') {
//                i--;
//                c++;
//            } else {
//                break;
//            }
//        }
//        return c;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n =  sc.nextInt();
//        System.out.println(lengthOfLastWord());

//    }
//
//}
