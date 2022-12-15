package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Count_frequency {
    public static void main(String[] args) {
        int arr[] = {10, 10, 20, 40, 30, 40, 30, 10};
        int n = arr.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            if(mp.containsKey(arr[i])){
                mp.put((arr[i]), mp.get(arr[i])+1);
            }
            else {
                mp.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
    }
}
