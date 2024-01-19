
import java.util.*;
public class Main
{
    public static int[] sortArray(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int m:nums){
            pq.add(m);
        }
        int arr[]=new int[nums.length];
        int k=0;
        while(!pq.isEmpty()){
            arr[k]=pq.poll();
            k++;
        }
        return arr;
    }

	public static void main(String[] args) {
		int arr[]={4,3,6,7,8,9,5,2,1};
		System.out.print(Arrays.toString(sortArray(arr)));
	}
}
