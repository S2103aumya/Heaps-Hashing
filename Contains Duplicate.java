import java.util.*;
public class Main
{
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i]) && Math.abs(i - hm.get(nums[i])) <= k) {
                return true;
            }

            hm.put(nums[i], i);
        }

        return false;
    }

	public static void main(String[] args) {
		int nums[] = {1,2,3,1};
		int k = 3;
		System.out.print(containsNearbyDuplicate(nums,k));
	}
}
