/**
 * @author sofiyan
 */
public class MountainCycleTire extends Tire{
    @Override
    public void getDescription() {
        System.out.println("Mountain Cycle Tire.");
        System.out.println("Count of Tire: "+ Tire.countOfTire);
        System.out.println("Price of one Tire: " + Tire.minPriceOfOneTire);
        System.out.println("\n\n");
    }
}
