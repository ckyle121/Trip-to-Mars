import java.util.ArrayList;

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

    }
}