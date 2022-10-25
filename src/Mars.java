public class Mars {
    public static void main(String[] args) throws Exception{
        // declare variables
        String colonyName = "Gazorpazorp";
        int shipPopulation = 300; 
        double shipFood = 4000.00;
        boolean landing = true;
        String landingLocation = "The Ocean";

        // landing process takes two day and people will eat 0.75 meals to save food
        shipFood -= shipPopulation * 0.75;
        shipFood -= shipPopulation * 0.75;

        // print food that is left
        System.out.println(shipFood);

        // a crate of fouod is found increasing food supply by 50%
        shipFood += shipFood * 0.5;

        // 3 births timed properly and 5 more babies join the population
        shipPopulation += 5;

        // create an if/else statement that checks to see if landing location is equal to "the Plain"
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            //if true print statement
            System.out.println("Bzzz landing on the plain");
        } 
        else {
            //if false print statement
            System.out.println("ERROR! flight plan already set. Landing on The Plain...");
        }

        landing = LandingCheck(100);
        //Call a function called LandingCheck() that has a parameter of 100, returns boolean, and set it equal to Landing
        
    }

    //Create a public static void function called LandingCheck with an int parameter called Loops
    private static boolean LandingCheck(int Loops) throws InterruptedException{
        for (int i=0; i<= Loops; i++){
            //Create an if statement with 1 if, 2 else ifs, and 1 else
            //The if statement should check to see if i divisible by 3 equals 0, and that i divisible by 5 equals 0
            if ((i % 3) ==0 && ((i % 5) ==0)){
                System.out.print("Keep Center");
            }
            //The first else if statement should check if i divisible by 5 equals 0
            else if ((i % 5) ==0){
                System.out.println("Right");
            }
            //The first else if statement should check if i divisible by 3 equals 0
            else if ((i % 3) == 0) {
                System.out.println("Left");
            }
            // Does not meet any conditions above
            else {
                System.out.println("Calculating....");
            }
    
            // Thread.sleep(250) slows the console down by 250 miliseconds
            Thread.sleep(250);
        }

        //Print "Landed"
        System.out.println("Landed");

        //The ship has landed on Mars. Return the value false;
        return false;
    }
}