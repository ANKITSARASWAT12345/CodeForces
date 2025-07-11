import java.util.*;

public class Parity_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            int arr[]=new int[n];
             
            int even[]=new int[n];
            int odd[]=new int[n];
             int oddCount=0;
             int evenCount=0;
            for(int i=0;i<n;i++){

                arr[i]=sc.nextInt();
                if(arr[i]%2==0){
                    even[evenCount++]=arr[i];
                }
                else{
                    odd[oddCount++]=arr[i];
                }
            }

            insertionSort(even,evenCount);

            insertionSort(odd, oddCount);

             int evenIndex=0;
             int oddIndex=0;
             int new_arr[]=new int[n];

             for(int i=0;i<n;i++){

                if(arr[i]%2==0){
                    new_arr[i]=even[evenIndex++];
                }
                else{
                    new_arr[i]=odd[oddIndex++];
                }
             }

             boolean sorted=true;

             for(int i=1;i<n;i++){
                if(new_arr[i]<new_arr[i-1]){
                    sorted=false;
                    break;
                }
             }
             System.out.println(sorted ? "YES" : "NO");

        }
    }
        public static void insertionSort(int[] arr, int n){
            for(int i=1;i<n;i++){
                int key=arr[i];
                int j=i-1;

                while(j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=key;
            }
        }
    
}
