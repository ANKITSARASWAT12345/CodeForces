import java.util.*;

public class Array_coloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            Arrays.sort(arr); // sort the array

            int cost = 0;
            for (int i = 0; i < n / 2; i++) {
                cost += arr[n - 1 - i] - arr[i];
            }

            System.out.println(cost);
        }

        sc.close();
    }
}
