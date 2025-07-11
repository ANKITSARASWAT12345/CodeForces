import java.util.*;
public class Prepend_and_Append {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
       
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int left=0;
            int right=n-1;
            int ans;
            while(left<=right){
                if(s.charAt(left)!=s.charAt(right)){
                    left++;
                    right--;
                }
                else{
                    break;
                }
            }
            ans=right-left;
           System.out.println(ans+1);
        }

        
    }
}
