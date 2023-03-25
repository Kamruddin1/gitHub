package RevisionAllTopics;

import java.util.Scanner;

public class conditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n >= 5){
            switch (n){
                case 1:
                    System.out.println("one");
                    break;
                case 2 :
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("thee");
                    break;
                case 4:
                    System.out.println("fourth");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                default:
                    System.out.println("this is not present number");
            }

        }
        else {
            System.out.println("this is not present number");
        }
    }

}
