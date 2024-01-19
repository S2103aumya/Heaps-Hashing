
import java.util.*;

public class Main {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(k, (a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            maxHeap.offer(entry);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll().getKey();
        }

        return result;
    }
    public static void main(String []args){
        int arr[]={5,7,2,5,6,5,2,5,2,7};
        int k=2;
        System.out.print(Arrays.toString(topKFrequent(arr,k)));
    }
}