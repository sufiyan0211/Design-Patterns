/**
 * @author sofiyan
 */
public class Engine {
    private int power;
    private String model;

    public Engine() {
    }

    public Engine(int power, String model) {
        this.power = power;
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
