import java.util.HashSet;

public class Main {
    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }

        int missing = 1;
        while (set.contains(missing)) {
            missing++;
        }

        return missing;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int result = firstMissingPositive(nums);
        System.out.println("The first missing positive integer is: " + result);
    }
}

