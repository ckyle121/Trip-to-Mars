public class Mars {
    public static void main(String[] args) {
        // declare global variables
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
        if (landingLocation.equalsIgnoreCase("The Plain")){
            
            //if true print landing on the plain
            System.out.println("Bzzz landing on the plain");
        } 
        else {
            //if false print landing on the plain
            System.out.println("ERROR! flight plan already set. Landing on The Plain...");
        }
    }
}
