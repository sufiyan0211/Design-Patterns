/**
 * <b>Abstract Factory pattern</b>
 * @author sofiyan
 */
public class Main {
    public static void main(String[] args) {

//        Create for road cycle

        CycleFactory cycleFactory = CycleFactoryCreator.createFactory("road");
        Tire tire = cycleFactory.createTire();
        Paddle paddle = cycleFactory.createPaddle();

        tire.getDescription();
        paddle.getDescription();

//        Create for mountain cycle

        CycleFactory cycleFactory1 = CycleFactoryCreator.createFactory("mountain");
        Tire tire1 = cycleFactory1.createTire();
        Paddle paddle1 = cycleFactory1.createPaddle();

        tire1.getDescription();
        paddle1.getDescription();


    }

}