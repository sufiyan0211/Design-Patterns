/**
 * @author sofiyan
 */
public class RoadCyclePaddle extends Paddle{
    @Override
    public void getDescription() {
        System.out.println("Road Cycle Paddle.");
        System.out.println("Count of Paddle: "+ Paddle.countOfPaddle);
        System.out.println("Price of one Paddle: " + Paddle.minPriceOfPaddle);
        System.out.println("\n\n");
    }
}
