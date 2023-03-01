/**
 * <p>
 * This class won't support <b>multithreading</b> because two or more instance can be created
 * when we us multithreading.
 * </p>
 *
 * @author sofiyan
 */
public class NonThreadedSingleton {

    private static NonThreadedSingleton nonThreadedSingleton;
    private static boolean initialized = false;

    private NonThreadedSingleton() {
        // Do the initialization of field work here
    }

    public static NonThreadedSingleton getInstance() {
        if(initialized == true) return nonThreadedSingleton;
        nonThreadedSingleton = new NonThreadedSingleton();
        initialized = true;
        return nonThreadedSingleton;
    }
}
