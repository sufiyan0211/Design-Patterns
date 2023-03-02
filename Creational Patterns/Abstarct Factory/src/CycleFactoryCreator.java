/**
 * @author sofiyan
 */
public class CycleFactoryCreator {
    public static CycleFactory createFactory(String type) {
        switch(type) {
            case "mountain" :
                return new MountainCycleFactory();
            case "road" :
                return new RoadCycleFactory();
        }
        return null;
    }
}
