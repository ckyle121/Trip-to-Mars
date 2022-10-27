import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsList{
    public static void main(String[] args) throws InterruptedException{
        new FindingsList();
    }

    public FindingsList() throws InterruptedException {

        // Thread.sleep(500) slows the console down by 1/2 a second
        Thread.sleep(500);

        ArrayList<String> rockList = new ArrayList<String>();

        System.out.println("Rock Data Downloaded.");

        // add 4 rocks to the rockList arrayList
        rockList.add("Rock");
        rockList.add("Weird Rock");
        rockList.add("Smooth Rock");
        rockList.add("Not Rock");

        System.out.println(rockList);

        System.out.println("Wait a second... that last one is not rock. Let's delete it from the list");

        rockList.remove("Not Rock");

        System.out.println(rockList);

        System.out.println("Perfect");

        // Thread.sleep(500) slows the console down by 1/2 a second
        Thread.sleep(500);

        HashMap<String, String> fossilDirectory = new HashMap<>();

        System.out.print("Fossil Data Downloaded.");

        // add 3 fossils to the fossil directory hashmap
        fossilDirectory.put("Bird Fossil", "This fossil has wings implying it was capable of flight.");
        fossilDirectory.put("Fish Fossil", "This fossil is vaguely fish shamped. This implies there was once water on this planet.");
        fossilDirectory.put("Tooth Fossil", "This is a tooth from an unknown fossil.");

        System.out.print("Which of these fossils would you like to know more about? (Spelling and Spacing important)\n");
        // scanner receieves input from user 
        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird Fossil")){
            System.out.print("Excellent Choice" + "\nFossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish Fossil")){
            System.out.print("Interesting Choice" + "\nFossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth Fossil")){
            System.out.print("Nice Choice" + "\nFossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }
        
        // Thread.sleep(500) slows the console down by 1/2 a second
        Thread.sleep(500);

        HashSet<String> suppliesBrought = new HashSet<>();
        HashSet<String> suppliesUsed = new HashSet<>();

        // add items to the suppliesBrought hashset
        suppliesBrought.add("Food");
        suppliesBrought.add("Water");
        suppliesBrought.add("Medicine");

        // add itms to the suppliesUsed hashset
        suppliesUsed.add("Food");
        suppliesUsed.add("Water");

        //print what is left
        System.out.println("Medicine");
    }
}