public class CandyFactory {

    public Candy getCandy(String type) {
        switch(type) {
            case "hard":
                return new HardCandy();
            case "soft":
                return new SoftCandy();
        }
        return null;
    }

}
