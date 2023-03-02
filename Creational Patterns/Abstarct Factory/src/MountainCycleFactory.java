/**
 * @author sofiyan
 */
public class MountainCycleFactory implements CycleFactory{
    @Override
    public Tire createTire() {
        return new MountainCycleTire();
    }

    @Override
    public Paddle createPaddle() {
        return new MountainCyclePaddle();
    }
}
