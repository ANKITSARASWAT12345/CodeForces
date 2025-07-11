import java.util.*;
public class Seating_in_a_Bus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){

            int n=sc.nextInt();

          int seats[]=new int[n];


            for(int i=0;i<n;i++){
        
                seats[i]=sc.nextInt();

            }

          Set<Integer> st=new HashSet<>();
         boolean result=true;
          for(int i=0;i<n;i++){
              int seat=seats[i];
            if(st.isEmpty()){
                st.add(seat);
            }
            else {
                if(st.contains(seat+1) || st.contains(seat-1)){
                st.add(seat);
            }
            else{
               result=false;
            }
          }
        }

          System.out.println(result?"YES":"NO");
        }
    }
}
