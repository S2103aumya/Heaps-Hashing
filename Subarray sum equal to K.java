import java.util.*;
public class Main
{
    public static int subarraySum(int[] nums, int k) {
        int sum=0;
        int ans=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hm.containsKey(sum-k)){
                ans+=hm.get(sum-k);
            }
            if(hm.containsKey(sum)){
                hm.put(sum,hm.get(sum)+1);
            } else {
                hm.put(sum,1);
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		int nums[] = {1,2,3};
		int k=3;
		System.out.println(subarraySum(nums,k));
	}
}
