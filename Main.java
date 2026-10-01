import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = {2, 7, 11, 15};  // Hardcoded array

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        Solution solution = new Solution();

        int[] result = solution.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers found.");
        }

        sc.close();
    }
}