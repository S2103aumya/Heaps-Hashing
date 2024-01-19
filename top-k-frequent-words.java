
import java.util.*;
public class Main
{
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>hm=new HashMap<>();
        for(int i=0;i<words.length;i++){
            hm.put(words[i],hm.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>>pq=new PriorityQueue<>((a,b) ->{
            if(a.getValue()==b.getValue()){
                return a.getKey().compareTo(b.getKey());
            }
            return b.getValue()-a.getValue();
        });
        for(Map.Entry<String,Integer>entry:hm.entrySet()){
            pq.add(entry);
        }
        List<String>l=new ArrayList<>();
        while(!pq.isEmpty()){
            if(k>0){
                Map.Entry<String,Integer>entry=pq.poll();
                l.add(entry.getKey());
            } else {
                break;
            }
            k--;
        }
        return l;
    }

	public static void main(String[] args) {
		String words[] = {"i","love","leetcode","i","love","coding"};
		int k = 2;
		List<String>l=topKFrequent(words,k);
		System.out.print(l);
	}
}
