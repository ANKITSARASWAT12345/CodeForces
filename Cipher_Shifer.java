import java.util.*;

public class Cipher_Shifer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt(); 
            String s = sc.next(); 

            StringBuilder decrypted = new StringBuilder();
            int i = 0;

            while (i < n) {
                char ch = s.charAt(i);
                int j = i + 1;

               
                while (j < n && s.charAt(j) != ch) {
                    j++;
                }

                decrypted.append(ch);

                i = j + 1;
            }

            System.out.println(decrypted.toString());
        }

        sc.close();
    }
}
