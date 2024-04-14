import java.util.*;
public class Main
{
    public static int countxor(int A[],int B){
        int count=0;
        int xor=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<A.length;i++){
            xor^=A[i];
            int reqxor=xor^B;
            count+=hm.getOrDefault(reqxor,0);
            if(xor==B){
                count++;
            }
            hm.put(xor,hm.getOrDefault(xor,0)+1);
        }
        return count;
    }
	public static void main(String[] args) {
	    int nums[]={4, 2, 2, 6, 4};
	    int B=6;
		System.out.println(countxor(nums,B));
	}
}
