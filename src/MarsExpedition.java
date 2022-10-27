import java.util.Scanner;

public class MarsExpedition {

    public MarsExpedition(){
         // scanner receieves input from user 
        Scanner input = new Scanner(System.in);

        System.out.println("Expedition prep program starting...\n" + 
            "Booting up...\n" + 
            "...\n" +  
            "...\n" + 
            "...\n" + 
            "Ready.");

        System.out.println("Hello user, what is your name?");

        String name = input.nextLine();

        System.out.println("Greetings, " + name  + "\nWelcome to the Mars Expedition Prep Program. \nAre you ready to head out into the new world? Type Y/N.");

        String excited = input.nextLine();

        if (excited.equalsIgnoreCase("Y")){
            System.out.println("I knew you would say that. You are a team leader for a reason!");
        } else {
            System.out.println("That's too bad. However, you're a team leader, so you have to go.");
        }

        System.out.println("How many cadets can we put on your team? (input a number)");

        int teamSize = input.nextInt();
        input.nextLine();

        if (teamSize > 2){
            System.out.println("That's way too many people. We can only send you and two more members.");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("That's not going to be enough people. We need to send you and two other members.");
            teamSize = 2; 
        } else {
            System.out.println("Excellent. That's a perfect size team.");
        }

        System.out.println("You can bring one weapon with you. Which do you choose?");

        String weapon = input.nextLine();

        System.out.println("Nice choice. You will be bringing a " + weapon + " with you."
        + " \nYou have a choice of three different vehicles" 
        + "\n A. Mars Rover"
        + "\n B. Chevy Silverado" 
        + "\n C. Honda Civic");

        String vehicle = input.nextLine();

        if (vehicle.equalsIgnoreCase("A")){
            vehicle = "Mars Rover";
        } else if (vehicle.equalsIgnoreCase("B")){
            vehicle = "Chevy Silverado";
        } else if (vehicle.equalsIgnoreCase("C")) {
            vehicle = "Honda Civic";
        } else {
            vehicle = "Your feet";
        }

        System.out.println("Your expedition team is now ready." 
            + "\nLed by " + name + " with " + teamSize + " teammmates."
            + "\nTo explore the surface of Mars using " + vehicle 
            + "\n Exploration team departs in" 
            + "\n5..."
            + "\n 4..." + "\n  3..." + "\n   2..." + "\n    1..."
            + "GO GO GO GO GO GO!!!"
        );

    }

}