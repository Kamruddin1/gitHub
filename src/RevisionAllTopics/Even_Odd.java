package RevisionAllTopics;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter any number=>");
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println("is a Even");
        }
        else {
            System.out.println("is a odd");
        }
    }
}
