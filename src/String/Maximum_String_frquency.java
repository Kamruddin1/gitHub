package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maximum_String_frquency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        String str = sc.next();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put((ch),map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }

        }
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());

        }



    }
}
