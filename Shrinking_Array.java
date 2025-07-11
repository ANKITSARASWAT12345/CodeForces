import java.util.*;

public class Shrinking_Array {
    static boolean isBeautiful(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (Math.abs(a[i] - a[i + 1]) <= 1) return true;
        }
        return false;
    }

    static boolean canBecomeBeautiful(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            // Try replacing a[i], a[i+1] with x = min(a[i], a[i+1])
            int x = Math.min(a[i], a[i + 1]);
            List<Integer> newList = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                if (j == i) {
                    newList.add(x);
                    j++; // Skip a[i+1]
                } else {
                    newList.add(a[j]);
                }
            }

            int[] newA = newList.stream().mapToInt(Integer::intValue).toArray();
            if (isBeautiful(newA)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            if (isBeautiful(a)) {
                System.out.println(0);
            } else if (n == 2) {
                System.out.println(-1);
            } else if (canBecomeBeautiful(a)) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }
    }
}
