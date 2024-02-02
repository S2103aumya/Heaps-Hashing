import java.util.*;
public class Main
{
    public static String decodeMessage(String key, String message) {
        HashMap<Character,Character>hm=new HashMap<>();
        int k=97;
        for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);
            if(Character.isLetter(ch) && !hm.containsKey(ch)){
                hm.put(ch,(char)k);
                k++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<message.length();i++){
            if(Character.isLetter(message.charAt(i))){
                sb.append(hm.get(message.charAt(i)));
            } else {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
	public static void main(String[] args) {
	    String key = "the quick brown fox jumps over the lazy dog";
	    String message = "vkbs bs t suepuv";
	    
		System.out.println(decodeMessage(key,message));
	}
}
