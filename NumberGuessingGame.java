import java.util.Random; 
import java.util.Scanner; 

public class NumberGuessingGame{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); 

        int randomNumber = random.nextInt(100) + 1; 
        int chances = 0; 
        int attemps = 0; 

        System.out.println("Welcome to Number Guessing Game");
        System.out.println("Rules");
        System.out.println("I will choose a number 1 - 100; Your job is to guess it"); 

        System.out.println("Choose difficulty: 1, 2, 3");
        System.out.print("Enter Difficulty: "); 
        String difficulty = scanner.nextLine().toLowerCase();
        
        if(difficulty.equals("1")){
            chances = 10; 
        }else if(difficulty.equals("2")){
            chances = 5; 
        }else if(difficulty.equals("3")){
            chances = 1; 
        }else{  
            throw new IllegalArgumentException(
                "Invalid Diffculty"
            ); 
        }

        while(chances > 0){
            System.out.print("Enter your guess : ");
            int guess = scanner.nextInt();
            attemps++; 
            chances--;
            
            if(guess == randomNumber){
                System.out.println("Correct!");
                return; 
            }else if(guess != randomNumber){
                System.out.println("Wrong :("); 
            }

            System.out.println("Chances left" + chances); 
        }

        System.out.println("Game over...ran out of chances"); 
        scanner.close(); 
    }
}