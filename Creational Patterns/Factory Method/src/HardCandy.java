import java.util.ArrayList;

public class HardCandy extends Candy{
    @Override
    public ArrayList<Candy> candyPackage(int quantity) {
        ArrayList hardCandyPackage = new ArrayList<>();
        for(int i=0;i<quantity;i++) {
            HardCandy hardCandy = new HardCandy();
            hardCandyPackage.add(hardCandy);
        }
        System.out.println("One Package of HardCandy contains "+ quantity + "candies");
        return hardCandyPackage;
    }
}
