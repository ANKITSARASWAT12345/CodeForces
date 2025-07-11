import java.util.*;

public class Long_long {
    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);

       int t=sc.nextInt();

       while(t-->0){

        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        boolean flag=false;

        long max_sum=0;
        int operation=0;

        for(int i=0;i<n;i++){

            max_sum+=Math.abs(arr[i]);
            if(arr[i]<0){
                if(!flag){
                    operation++;
                    flag=true;
                }
            }
            else if(arr[i]!=0){
                flag=false;
            }
        }

        System.out.println(max_sum+" "+operation);
       }
    }
}
