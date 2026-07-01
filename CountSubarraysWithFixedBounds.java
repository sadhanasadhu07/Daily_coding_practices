import java.util.Scanner;

public class CountSubarraysWithFixedBounds {
     public static long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;

        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int max = nums[i];

            for (int j = i; j < nums.length; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);

                if (min == minK && max == maxK) {
                    count++;
                }

                if (nums[j] < minK || nums[j] > maxK) {
                    break;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine(); // 1,3,5,2,7,5

    int minK = sc.nextInt();
    int maxK = sc.nextInt();

    String[] arr = input.split(",");

    int[] nums = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
        nums[i] = Integer.parseInt(arr[i].trim());
    }

    System.out.println(
            countSubarrays(nums, minK, maxK));
}
}
