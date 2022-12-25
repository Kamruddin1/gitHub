package Arrays;

import java.util.Scanner;

public class conditional_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int choose = sc.nextInt();
        if(n>0){
            switch(n){
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("tree");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
            }
        }
        else{
            System.out.println("Greater than 5");
        }
    }
}
