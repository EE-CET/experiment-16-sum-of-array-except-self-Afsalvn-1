
import java.util.Scanner;

public class SumExceptSelf {

    // Task: Return an array where output[i] is the sum of all elements except nums[i]
    public int[] calculateSumExceptSelf(int[] nums, int n) {
        int[] output = new int[n];
        
        // We use a long for the total sum to prevent integer overflow
        // if the array contains many large numbers.
        long totalSum = 0; 

        // Step 1: Calculate the total sum of all elements in the array
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }

        // Step 2: For each element, the sum except itself is (totalSum - nums[i])
        for (int i = 0; i < n; i++) {
            output[i] = (int)(totalSum - nums[i]);
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            
            // Read the array elements
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            
            SumExceptSelf solver = new SumExceptSelf();
            int[] result = solver.calculateSumExceptSelf(nums, n);
            
            // Output the resultant array elements separated by spaces
            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + (i == n - 1 ? "" : " "));
            }
            System.out.println(); // Move to the next line after printing
        }
        
        sc.close();
    }
}
