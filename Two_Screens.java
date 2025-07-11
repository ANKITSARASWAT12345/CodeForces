import java.util.*;

public class Two_Screens {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int q=sc.nextInt();


        while(q-->0){

         String s=sc.next();
         String t=sc.next();
         int max_match=0;
          
         for(int i=0;i<=s.length();i++){
            String suffix=s.substring(i);

            if(t.startsWith(suffix)){
                max_match=suffix.length();
                break;  
            }
         }

         int operation=0;
         if(max_match>0){
             operation=s.length()+1+(t.length()-max_match);
         }
         else{
            operation=s.length()+(t.length()-max_match);
         }
         System.out.println(operation);


        }
    }
}
