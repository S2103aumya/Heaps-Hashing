
import java.util.*;
public class Main
{
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int m:nums){
            pq.add(m);
        }
        while(!pq.isEmpty()){
            int num=pq.poll();
            k--;
            if(k==0){
                return num;
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		int arr[]={2,6,5,3,4,1};
		int k=2;
		System.out.print(findKthLargest(arr,k));
	}
}
