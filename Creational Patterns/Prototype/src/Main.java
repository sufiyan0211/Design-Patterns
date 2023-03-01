/**
 * @author sofiyan
 */
public class Main {
    public static void main(String[] args) {
        Vehicle twoWheeler = new Vehicle();
        Engine lowPowerEngine = new Engine(200, "hps");

        twoWheeler.setBrand("Bajaj");
        twoWheeler.setWheelsCount(2);
        twoWheeler.setEngine(lowPowerEngine);

        Vehicle fourWheeler = twoWheeler.clone();

        System.out.println("TwoWheeler's wheel Count: " + twoWheeler.getWheelsCount());
        System.out.println("TwoWheeler's Engine Power: " + twoWheeler.getEngine().getPower());
        System.out.println("FourWheeler's wheel Count: " + fourWheeler.getWheelsCount());
        System.out.println("FourWheeler's Engine Power: " + fourWheeler.getEngine().getPower());

        Engine highPowerEngine = new Engine(1500, "Crdi");

        fourWheeler.setWheelsCount(4);
        fourWheeler.setEngine(highPowerEngine);
        fourWheeler.setBrand("Hyundai");


        System.out.println("\n\n\n");
        System.out.println("TwoWheeler's wheel Count: " + twoWheeler.getWheelsCount());
        System.out.println("TwoWheeler's Engine Power: " + twoWheeler.getEngine().getPower());
        System.out.println("FourWheeler's wheel Count: " + fourWheeler.getWheelsCount());
        System.out.println("FourWheeler's Engine Power: " + fourWheeler.getEngine().getPower());


        System.out.println("\n\n\n");
        System.out.println("hashCode for twoWheeler's object: "+ twoWheeler.hashCode());
        System.out.println("hashCode for fourWheeler's object: "+ fourWheeler.hashCode());

    }
}