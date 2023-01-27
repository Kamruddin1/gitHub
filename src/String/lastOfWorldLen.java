package String;

public class lastOfWorldLen {
    public static void main(String[] args) {
        String s = "hey i'm  ansari";
        System.out.println(lastOfLength(s));

    }
    static int lastOfLength(String s){
        String str = s.trim();
        int count =0;
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i)!=' ') {
                count++;
            }
            else {
                break;
            }
            }
        return count;
        }
    }

