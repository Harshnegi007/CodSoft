import java.util.Scanner;

public class Number_Game{
    
    public static void main(String[] args) {

        int trial=5;
        Scanner sc=new Scanner(System.in);

        int answer = (int)(Math.random() * 100) + 1;
        int ussed=1;
        System.out.println("----------Guess the number----------");

        while(true){
            int val=sc.nextInt();

            if(val==answer){
                System.out.println("You are Correct");
                System.out.println("Total number of Trials: "+ussed);
            }
            else if(val<answer){
                System.out.println("TOO LOW!!!!");
                System.out.println("Trials left : "+(trial-1));
            }
            else{
                System.out.println("TOO HIGH!!!!");
                System.out.println("Trials left : "+(trial-1));
            }
            
            trial--;
            ussed++;

            if(trial<1){
                System.out.println("The number was : "+answer);
                System.out.println("No more tries left!!!! Better luck next time");
                break;
            }
        }
        
    }
}