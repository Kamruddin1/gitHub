package HashMap;

import java.util.HashMap;
import java.util.Map;
public class Count_frequency {
    public static void main(String[] args) {
       int arr[] = {1,1,2,3,4,4,4,5};
       int n= arr.length;
       HashMap<Integer,Integer> hm = new HashMap<>();
       for(int i=0; i<n; i++){
       if(hm.containsKey(arr[i])){
           hm.put((arr[i]),hm.get(arr[i])+1);
       }
       else{
           hm.put(arr[i],1);
       }
       }
       for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
           System.out.println(entry.getKey() + "-->" + entry.getValue());
       }
    }
}
