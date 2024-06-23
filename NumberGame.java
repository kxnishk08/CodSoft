import java.util.*;
public class NumberGame{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int min=0;
        int x=0;
        int max=100;
        int num = (int)(Math.random()*(max-min+1)+min);  
        System.out.println("Enter Your Guess");
        while(x!=1){
            int guess = sc.nextInt();
            if(guess>num)
            {
                System.out.println("Too High");  
            }
            else if (guess==num)
            {
                System.out.println("You guessed the number!");
                x++;
            }
            else if (guess<num)
            {
                System.out.println("Too Low");
            }
        }
    }
}
