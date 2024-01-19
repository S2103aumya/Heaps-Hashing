import java.util.*;

public class Main
{
    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int arr[]=new int[2];
        HashSet<Integer>hs1=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            hs1.add(nums2[i]);
        }
        int count1=0;
        for(int i=0;i<nums1.length;i++){
            if(hs1.contains(nums1[i])){
                count1++;
            }
        }
        HashSet<Integer>hs2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs2.add(nums1[i]);
        }
        int count2=0;
        for(int i=0;i<nums2.length;i++){
            if(hs2.contains(nums2[i])){
                count2++;
            }
        }
        arr[0]=count1;
        arr[1]=count2;
        return arr;
    }

	public static void main(String[] args) {
		int nums1[] = {4,3,2,3,1};
		int nums2[] = {2,2,5,2,3,6};
		System.out.print(Arrays.toString(findIntersectionValues(nums1,  nums2)));
	}
}
