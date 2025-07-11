
import java.util.*;
public class Favorite_Sequence {

    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);

    int t=sc.nextInt();


    while(t-->0){

        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
       
        int left=0;
        int right=n-1;
       
        boolean leftTurn=true;
        
        List<Integer> li=new ArrayList<>();
        while(left<=right){
          
            if(leftTurn){
               li.add(arr[left]);
               left++;
            }
            else{
                li.add(arr[right]);
                right--;
            } 

            leftTurn=!leftTurn;
        }

        for(int num:li){
            System.out.print(num+" ");
        }
        System.out.println();

    }
   }
}
