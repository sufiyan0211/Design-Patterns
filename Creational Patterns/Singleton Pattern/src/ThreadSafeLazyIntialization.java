/**
 * <p>
 * This class support <b>multithreading</b>.
 *  <ul>
 *      <li>Thread Safe.</li>
 *      <li>Lazy Initialization.</li>
 *      <li>Singleton class.</li>
 *      <li>Synchronization method is used because
 *          <ul>
 *              <li>Only one thread can access one synchronized at a time (i.e. One thread at a time).</li>
 *          </ul>
 *      </li>
 *  </ul>
 *  <p>
 *      <b>Note:</b> <br>
 *      Synchronization will definitely decrease the performance because only one thread can access the method at a time and
 *      hence other threads has to wait for the completion previous thread.
 *  </p>
 * </p>
 *
 * @author sofiyan
 */
public class ThreadSafeLazyIntialization {
    private static ThreadSafeLazyIntialization threadSafeLazyIntialization;
    private static boolean initialized = false;
    private ThreadSafeLazyIntialization() {
        // Do the initialization of field work here
    }
    public static synchronized ThreadSafeLazyIntialization getInstance() {
        if(initialized == true) return threadSafeLazyIntialization;
        threadSafeLazyIntialization = new ThreadSafeLazyIntialization();
        initialized = true;
        return threadSafeLazyIntialization;
    }

}
