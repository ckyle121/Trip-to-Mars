import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
        public GuessingGame(){
            Scanner input = new Scanner(System.in);

            boolean correctGuess = false; 
            int guess = 0; 
            int increment = 0;

            System.out.println("Hello user, what is your name?");

            String name = input.nextLine();

            System.out.println("Welcome " + name + ". I am thinking of a number between 1 and 100.\n");

            Random randomNumber = new Random();

            int number = randomNumber.nextInt();

            System.out.println("Try and guess my number....");

            // loop through guess of user, if wrong keep playing. 

            while (correctGuess == false){
                increment++;

                try {
                    guess = input.nextInt();
                } catch (Exception e) {
                    String badInput = input.next();

                    System.out.print("That's not a number. Try again.");

                    continue;
                }

                if (guess > 100 || guess < 1){
                    System.out.print("That number is wayyyyy out of my range");
                } else if (guess > number){
                    System.out.println("Your guess is too low. Please guess again.");
                } else if (guess < number) {
                    System.out.println("Your guess is too low. Please guess again.");
                } else if (guess == number) {
                    System.out.println("You guessed my number! Well done.\n" + "You guessed my number in " + increment + " attempts.");

                    correctGuess = true; 
                }
            }
    }
}