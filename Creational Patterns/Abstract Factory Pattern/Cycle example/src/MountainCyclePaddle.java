/**
 * @author sofiyan
 */
public class MountainCyclePaddle extends Paddle{
    @Override
    public void getDescription() {
        System.out.println("Mountain Cycle Paddle.");
        System.out.println("Count of Paddle: "+ Paddle.countOfPaddle);
        System.out.println("Price of one Paddle: " + Paddle.minPriceOfPaddle);
        System.out.println("\n\n");
    }

}
