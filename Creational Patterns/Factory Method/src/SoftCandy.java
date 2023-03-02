import java.util.ArrayList;

public class SoftCandy extends Candy{
    @Override
    public ArrayList<Candy> candyPackage(int quantity) {
        ArrayList softCandyPackage = new ArrayList<>();
        for(int i=0;i<quantity;i++) {
            SoftCandy softCandy = new SoftCandy();
            softCandyPackage.add(softCandy);
        }
        System.out.println("One Package of SoftCandy contains "+ quantity + "candies");
        return softCandyPackage;
    }
}
