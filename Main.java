
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     
     int n=sc.nextInt();

     int cards[]=new int[n];

    
     for(int i=0;i<n;i++){
       cards[i]=sc.nextInt();
     }
     sc.close();


     int left=0;
     int right=n-1;
     int serejaSum=0;
     int DimaSum=0;
     boolean serejaTurn=true;

     while(left<=right){
        int choosenCard;
        if(cards[left]>cards[right]){
            choosenCard=cards[left++];
        }
        else{
            choosenCard=cards[right--];
        }
        if(serejaTurn){
            serejaSum+=choosenCard;
        }
        else{
            DimaSum+=choosenCard;
        }
        serejaTurn=!serejaTurn;

     }


     System.out.println(serejaSum+" "+DimaSum);
    }
}