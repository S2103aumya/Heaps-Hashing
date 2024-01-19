import java.util.*;
public class Main
{
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            hm.put(nums1[i],hm.getOrDefault(nums1[i],0)+1);
        }
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(hm.containsKey(nums2[i]) && hm.get(nums2[i])>=1){
                l.add(nums2[i]);
                hm.put(nums2[i],hm.get(nums2[i])-1);
            }
        }
        int arr[]=new int[l.size()];
        int k=0;
        for(int m:l){
            arr[k]=m;
            k++;
        }
        return arr;
    }
	public static void main(String[] args) {
	    int nums1[] ={1,2,2,1};
	    int nums2[] = {2,2};
	    System.out.print(Arrays.toString(intersect(nums1, nums2)));
	}
}
