
import java.util.*;
public class Main
{
    public static String frequencySort(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>>pq=new PriorityQueue<>
        ((a,b) ->(b.getValue() -a.getValue()));
        for(Map.Entry<Character,Integer>entry:hm.entrySet()){
            pq.add(entry);
        }
        StringBuilder sb=new StringBuilder();
        while(pq.size()>0){
            Map.Entry<Character, Integer> entry = pq.poll();
            char character = entry.getKey();
            int frequency = entry.getValue();
            
            // Append the character 'frequency' times
            for (int i = 0; i < frequency; i++) {
                sb.append(character);
            }
        }
    return sb.toString();
    }
	public static void main(String[] args) {
		String s="tree";
		System.out.print(frequencySort(s));
	}
}
