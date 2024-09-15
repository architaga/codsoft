import java.util.*;
public class Main {
    public static boolean playRound(int maxAttempts){
        Random rand=new Random();
        int numberToGuess=rand.nextInt();
        Scanner sc=new Scanner(System.in);
        System.out.println("I have generated a no. between 1 & 100.Try to guess it!");
        for(int attempt=1;attempt<=maxAttempts;attempt++){
            System.out.println("Attempt"+attempt+"/"+maxAttempts+":Enter your guess:");
            int guess=sc.nextInt();
            if(guess<numberToGuess){
                System.out.println("Too low! Try again");
            }else if(guess>numberToGuess){
                System.out.println("Too high! Try again");
            }else{
                System.out.println("Congratulations! You've guesed the no. "+numberToGuess+" correctly.");
                return true;
            }
        }
        System.out.println("Sorry, you've used all your attempts.The no. was "+numberToGuess+".");
        return false;
 
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int totalRounds=0;
        int roundsWon=0;
        int maxAttempts=10;
        
        while(true){
            System.out.println("\nStarting a new round!");
            if(playRound(maxAttempts)){
                roundsWon++;
            }
            totalRounds++;
            System.out.print("Do you want to play again? (yes/no):");
            String playAgain=scanner.next().trim().toLowerCase();
            if(!playAgain.equals("yes")){
                break;
            }
            
        }
        System.out.println("/nGame over!You played "+totalRounds+" rounds and won"+roundsWon+"times.");
        System.out.printf("Your winning precentage is %0.2f%%\n",(roundsWon/(double) totalRounds)*100);
        
    }
    
}
