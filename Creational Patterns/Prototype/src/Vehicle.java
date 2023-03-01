/**
 * @author sofiyan
 */
public class Vehicle implements Cloneable{
    private String brand;
    private int wheelsCount;
    private Engine engine;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Vehicle() {
    }

    @Override
    public Vehicle clone() {
        try{
            return (Vehicle) super.clone();
        } catch(CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


}
