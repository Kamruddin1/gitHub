package String;
import java.util.Scanner;
public class StringPallindromOrNot {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Charcter");
      String a = sc.nextLine();
      int n = a.length();
      String revs = "";
      for(int i=n-1; i>=0; i--){

          revs = revs + a.charAt(i);

      }
        if(a.equals(revs)){
            System.out.println("is PallingDrom");
        }
        else {
            System.out.println("Not Pallindrom");
        }

    }
}
