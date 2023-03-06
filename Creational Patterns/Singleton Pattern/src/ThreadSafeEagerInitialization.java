/**
 * <p>
 * This class support <b>multithreading</b>.
 *  <ul>
 *      <li>Thread Safe.</li>
 *      <li>Eager Initialization.</li>
 *      <li>Singleton class.</li>
 *  </ul>
 *
 * @author sofiyan
 */
public class ThreadSafeEagerInitialization {

    private static final ThreadSafeEagerInitialization threadSafeEagerInitialization = new ThreadSafeEagerInitialization();
    private ThreadSafeEagerInitialization() {
        // Do the initialization of field work here
    }

    public static ThreadSafeEagerInitialization getInstance() {
        return threadSafeEagerInitialization;
    }
}
