import java.util.*;

public class Eraser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            char[] arr = sc.next().toCharArray();

            int ops = 0;
            int i = 0;

            while (i <= n - k) {
                if (arr[i] == 'B') {
                    for (int j = 0; j < k; j++) {
                        arr[i + j] = 'W';
                    }
                    ops++;
                }
                i++;
            }

            for (int j = n - k + 1; j < n; j++) {
                if (arr[j] == 'B') {
                    ops++;
                    break;
                }
            }

            System.out.println(ops);
        }
    }
}
