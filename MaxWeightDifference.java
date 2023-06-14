import java.util.Arrays;
import java.util.Scanner;

public class MaxWeightDifference {
    // Function to calculate the maximum possible weight difference
    private static int calculateMaxWeightDifference(int N, int K, int[] weights) {
        Arrays.sort(weights);  // Sort the weights in non-decreasing order
        int sonGroupSum = 0;  // Sum of the first K items (son's group)
        int chefGroupSum = 0;  // Sum of the remaining items (Chef's group)
        
        for (int i = 0; i < K; i++) {
            sonGroupSum += weights[i];
        }
        
        for (int i = K; i < N; i++) {
            chefGroupSum += weights[i];
        }
        
        return chefGroupSum - sonGroupSum;  // Maximum possible difference
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Iterate through each test case
        for (int t = 0; t < T; t++) {
            // Read the values of N and K for the current test case
            int N = scanner.nextInt();
            int K = scanner.nextInt();

            // Read the weights of the items for the current test case
            int[] weights = new int[N];
            for (int i = 0; i < N; i++) {
                weights[i] = scanner.nextInt();
            }

            // Calculate and print the maximum possible weight difference for the current test case
            System.out.println(calculateMaxWeightDifference(N, K, weights));
        }
        
        scanner.close();
    }
}