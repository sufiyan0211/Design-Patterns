/**
 * @author sofiyan
 */
public class RoadCycleFactory implements CycleFactory{

    @Override
    public Tire createTire() {
        return new RoadCycleTire();
    }

    @Override
    public Paddle createPaddle() {
        return new RoadCyclePaddle();
    }
}
